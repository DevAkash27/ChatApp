// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()

    }
    dependencies {
       ( "classpath 'com.android.tools.build:gradle:3.6.4'")
       ("classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0'")
     ("   classpath 'androidx.navigation:navigation-safe-args-gradle-plugin:2.6.0-alpha08'")
       (" classpath 'com.google.gms:google-services:4.3.10'")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}



plugins {
    ("id 'com.android.application' version '7.4.2' apply false")
    ("id 'com.android.library' version '7.4.2' apply false")
    ("id 'org.jetbrains.kotlin.android' version '1.8.0' apply false")
}