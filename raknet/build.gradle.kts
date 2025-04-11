import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm()

    js {
        nodejs()
    }

    macosX64()
    macosArm64()
    linuxX64()
    linuxArm64()
    mingwX64()
}

android {
    namespace = "vip.cdms.protokol.bedrock.raknet"
    compileSdk = libs.versions.android.sdk.compile.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.sdk.min.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
