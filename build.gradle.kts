buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = uri("https://maven.google.com"))
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = uri("https://maven.google.com"))
    }
}
