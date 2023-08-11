//buildscript {
//    dependencies {
//        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
//    }
//}
plugins {
    id(ProjectProperties.Gradle.APPLICATION) version Versions.GRADLE apply false
    id(ProjectProperties.Gradle.LIBRARY) version Versions.GRADLE apply false
    id(ProjectProperties.Gradle.KOTLIN) version Versions.KOTLIN apply false
    id(ProjectProperties.Gradle.KTLINT) version Versions.KTLINT
//    id(ProjectProperties.Gradle.JITPACK)
}