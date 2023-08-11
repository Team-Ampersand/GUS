import org.gradle.api.JavaVersion

object ProjectProperties {
    object Gradle {
        const val APPLICATION = "com.android.application"
        const val LIBRARY = "com.android.library"
        const val KOTLIN = "org.jetbrains.kotlin.android"
        const val KTLINT = "org.jlleitschuh.gradle.ktlint"
//        const val JITPACK = "maven-publish"
//        const val JITPACK_GRADLE = "com.github.dcendents.android-maven"
    }

    object Test {
        const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Files {
        const val DEFAULT_PROGUARD = "proguard-android-optimize.txt"
        const val PROGUARD = "proguard-rules.pro"
        const val CONSUMER_PROGUARD = "consumer-rules.pro"
    }

    object Versions {
        const val COMPILE_SDK = 33
        const val MIN_SDK = 24
        const val TARGET_SDK = 33
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
        val JAVA_VERSION = JavaVersion.VERSION_11
        const val JVM_TARGET = "11"
    }

    object NameSpace {
        const val APP = "com.mpersand.gus"
        const val GYMI_COMPONENTS = "com.mpersand.gymi_components"
    }
}