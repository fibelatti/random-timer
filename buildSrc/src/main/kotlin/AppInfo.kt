object AppInfo {
    const val appName = "Random Timer"
    const val applicationId = "com.fibelatti.randomtimer"

    private const val versionMajor = 1
    private const val versionMinor = 0
    private const val versionPatch = 0
    private const val versionBuild = 0

    val versionCode: Int = (versionMajor * 1000000 +
        versionMinor * 10000 +
        versionPatch * 100 +
        (versionBuild.takeIf { it != 0 } ?: 99))
        .also { println("versionCode is $it") }

    val versionName: String = "$versionMajor.$versionMinor.$versionPatch"
        .also { println("versionName is $it") }
}
