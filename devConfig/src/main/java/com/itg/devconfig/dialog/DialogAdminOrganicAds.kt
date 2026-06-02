package com.itg.devconfig.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import android.view.Window
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import com.ads.module.util.SharePreferenceUtils
import com.itg.devconfig.DevConfigRouter
import com.itg.devconfig.R
import com.itg.devconfig.databinding.DialogAdminOrganicAdsBinding
import com.itg.devconfig.utils.click

object DialogAdminOrganicAds {

    fun show(context: Context) {
        val activity = context.findActivity() ?: return
        if (activity.isFinishing || activity.isDestroyed) return

        val binding = DialogAdminOrganicAdsBinding.inflate(activity.layoutInflater)
        val dialog = Dialog(activity, R.style.DevConfigDialog)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
        dialog.setCancelable(false)

        syncSwitchFromPreference(context, binding)

        binding.btnChecklist.click {
            dialog.dismiss()
            DevConfigRouter.openDeveloperChecklist(activity)
        }

        binding.btnApply.click {
            val unlimitedAdsEnabled = binding.switchUnlimitedAds.isChecked
            SharePreferenceUtils.setIsOrganic(context, !unlimitedAdsEnabled)

            val messageRes = if (unlimitedAdsEnabled) {
                R.string.txt_admin_ads_unlimited_enabled
            } else {
                R.string.txt_admin_ads_unlimited_disabled
            }
            Toast.makeText(context, context.getString(messageRes), Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }

        dialog.setContentView(binding.root)
        dialog.show()
    }

    private fun syncSwitchFromPreference(
        context: Context,
        binding: DialogAdminOrganicAdsBinding
    ) {
        val isOrganic = SharePreferenceUtils.getIsOrganic(context)
        binding.switchUnlimitedAds.isChecked = !isOrganic
    }

    private tailrec fun Context.findActivity(): Activity? = when (this) {
        is Activity -> this
        is ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
