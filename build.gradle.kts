plugins {
    kotlin("multiplatform") version "1.8.10"
}

repositories {
    mavenCentral()
    google()
}

kotlin {
    iosSimulatorArm64 {
        binaries.framework {
            baseName = "Foo"
        }
    }
    sourceSets {
        getByName("iosSimulatorArm64Main") {
            dependencies {
                api("androidx.datastore:datastore-preferences-core:1.1.0-alpha02")
            }
        }
    }
}
