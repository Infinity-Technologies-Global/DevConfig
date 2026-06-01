package com.itg.devconfig.ui

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.itg.devconfig.DevConfig
import com.itg.devconfig.R
import com.itg.devconfig.databinding.ActivityDeveloperChecklistBinding
import com.itg.devconfig.utils.MediationCheckUtils
import com.itg.devconfig.utils.click

class DeveloperChecklistActivity : DevConfigBaseActivity<ActivityDeveloperChecklistBinding>() {

    private var checklistAdapter: DeveloperChecklistAdapter? = null

    override fun getLayoutId(): Int = R.layout.activity_developer_checklist

    override fun onBind() {
        bindBuildVariantBadge()
        checklistAdapter = DeveloperChecklistAdapter(
            DeveloperChecklistRepository.buildChecklistItems(this, mediationStatuses = null)
        )
        binding.rvChecklist.apply {
            layoutManager = LinearLayoutManager(this@DeveloperChecklistActivity)
            adapter = checklistAdapter
            setHasFixedSize(true)
        }
        binding.imvBack.click { finish() }
        loadMediationStatuses()
    }

    private fun loadMediationStatuses() {
        MediationCheckUtils.fetchMediationStatuses(this) { statuses ->
            if (isFinishing || isDestroyed) return@fetchMediationStatuses
            checklistAdapter?.replaceItems(
                DeveloperChecklistRepository.buildChecklistItems(
                    context = this,
                    mediationStatuses = statuses
                )
            )
        }
    }

    private fun bindBuildVariantBadge() {
        val config = DevConfig.requireAppConfig()
        binding.tvBuildVariant.apply {
            text = if (config.isDebugBuild) {
                getString(R.string.developer_checklist_build_debug, config.versionName)
            } else {
                getString(R.string.developer_checklist_build_release, config.versionName)
            }
            background = ContextCompat.getDrawable(
                this@DeveloperChecklistActivity,
                if (config.isDebugBuild) {
                    R.drawable.bg_build_badge_debug
                } else {
                    R.drawable.bg_build_badge_release
                }
            )
        }
    }
}
