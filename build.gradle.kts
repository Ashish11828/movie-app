plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.movies"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.movies"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.gson)
    implementation(libs.androidx.paging.common.android)
    implementation(libs.androidx.paging.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Room
    implementation ("androidx.room:room-runtime:2.6.1")
    ksp ("androidx.room:room-compiler:2.6.1")
    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.1")
    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.3")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.3")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
    // Navigation Components
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    // Glide
    implementation ("com.github.bumptech.glide:glide:4.13.0")
    ksp ("com.github.bumptech.glide:compiler:4.13.0")

    // Work Manager
    implementation("androidx.work:work-runtime-ktx:2.9.0")

    // Hilt
    implementation ("com.google.dagger:hilt-android:2.51.1")
    kapt ("com.google.dagger:hilt-android-compiler:2.51.1")

    // Pagination
    implementation("com.github.paginationspring:pagination:1.0.3")

    // Splash Screen
    implementation("androidx.core:core-splashscreen:1.2.0-alpha01")

}