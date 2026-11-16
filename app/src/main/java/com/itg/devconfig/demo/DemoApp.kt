package com.itg.devconfig.demo

import com.ads.nkh.ads.NkhAd
import com.ads.nkh.application.AdsMultiDexApplication
import com.ads.nkh.config.NkhAdConfig
import com.itg.devconfig.DevConfig

class DemoApp : AdsMultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        initNextGenAds()
        initDevConfig()
    }

    private fun initNextGenAds() {
        mNkhAdConfig.setEnvironment(NkhAdConfig.ENVIRONMENT_DEVELOP)
        mNkhAdConfig.isEnableDebugMode = true
        NkhAd.getInstance().init(this, mNkhAdConfig)
    }

    private fun initDevConfig() {
        DevConfig.init(
            context = this,
            nkhStudioVersion = BuildConfig.NKH_NEXTGEN_VERSION,
            playServicesAdsVersion = BuildConfig.PLAY_SERVICES_ADS_VERSION,
            gdprModuleVersion = BuildConfig.GDPR_MODULE_VERSION
        )
    }
}
