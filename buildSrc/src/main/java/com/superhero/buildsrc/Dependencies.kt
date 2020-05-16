object Version {
    const val COMPILE_SDK_VERSION = 29
    const val MIN_SDK_VERSION = 18
    const val TARGET_SDK_VERSION = 29
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val BUILD_TOOLS_VERSION = "29.0.3"

    const val KOTLIN = "1.3.72"
    const val APPCOMPAT = "1.1.0"
    const val CORE_KTX = "1.2.0"
    const val JUNIT = "4.12"
    const val RETROFIT = "2.3.0"
    const val EXT_JUNIT = "1.1.1"
    const val ESPRESSO = "3.2.0"
    const val GRADLE = "3.6.3"
    const val KOTLIN_GRADLE_PLUGIN = "3.2.0"
}

object Libraries {
    const val KOTLIN =  "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Version.APPCOMPAT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Version.CORE_KTX}"
    const val JUNIT = "junit:junit:${Version.JUNIT}"
    const val EXT_JUNIT = "androidx.test.ext:junit:${Version.EXT_JUNIT}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Version.ESPRESSO}"
    const val GRADLE = "com.android.tools.build:gradle:${Version.GRADLE}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
}
