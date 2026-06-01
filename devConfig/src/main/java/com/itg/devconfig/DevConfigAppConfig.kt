package com.itg.devconfig

data class DevConfigAppConfig(
    val isDebugBuild: Boolean,
    val versionName: String,
    val adjustToken: String,
    val facebookAppId: String,
    val facebookClientToken: String,
    val tiktokEventToken: String,
    val nkhStudioVersion: String,
    val playServicesAdsVersion: String,
    val gdprModuleVersion: String
)
