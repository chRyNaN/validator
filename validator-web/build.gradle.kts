import com.chrynan.validator.buildSrc.LibraryConstants
import com.chrynan.validator.buildSrc.isBuildingOnLinux
import com.chrynan.validator.buildSrc.isBuildingOnOSX
import com.chrynan.validator.buildSrc.isBuildingOnWindows
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.dokka")
}

group = LibraryConstants.group
version = LibraryConstants.versionName

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget {
        publishAllLibraryVariants()
    }

    jvm()

    js(IR) {
        browser {
            testTask {
                useKarma {
                    useFirefox()
                }
            }
        }
        nodejs()
    }

    @Suppress("OPT_IN_USAGE")
    wasmJs {
        browser {
            testTask {
                useKarma {
                    useFirefox()
                }
            }
        }
    }

    if (isBuildingOnOSX()) {
        iosX64()
        iosArm64()
        iosSimulatorArm64()
        tvosX64()
        tvosArm64()
        watchosX64()
        watchosArm64()
        macosX64()
        macosArm64()
    }

    if (isBuildingOnLinux()) {
        linuxX64()
    }

    if (isBuildingOnWindows()) {
        mingwX64()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":validator-core"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        if (isBuildingOnOSX()) {
            val iosMain by sourceSets.getting
            val iosSimulatorArm64Main by sourceSets.getting
            iosSimulatorArm64Main.dependsOn(iosMain)
        }
    }
}

android {
    compileSdk = LibraryConstants.Android.compileSdkVersion
    namespace = "com.chrynan.validator.web"

    defaultConfig {
        minSdk = LibraryConstants.Android.minSdkVersion
        targetSdk = LibraryConstants.Android.targetSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            // Opt-in to experimental compose APIs
            freeCompilerArgs = listOf(
                "-Xopt-in=kotlin.RequiresOptIn"
            )
        }
    }

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].java.srcDirs("src/androidMain/kotlin")
    sourceSets["main"].res.srcDirs("src/androidMain/res")

    sourceSets["test"].java.srcDirs("src/androidTest/kotlin")
    sourceSets["test"].res.srcDirs("src/androidTest/res")
}

tasks.withType<Jar> { duplicatesStrategy = DuplicatesStrategy.INHERIT }

afterEvaluate {
    publishing {
        repositories {
            maven {
                url = uri("https://repo.repsy.io/mvn/chrynan/public")

                credentials {
                    username = (project.findProperty("repsyUsername") ?: System.getenv("repsyUsername")) as? String
                    password = (project.findProperty("repsyToken") ?: System.getenv("repsyToken")) as? String
                }
            }
        }
    }
}
