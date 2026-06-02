package com.itg.devconfig.utils

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.view.MotionEvent
import android.view.View
import com.itg.devconfig.dialog.DialogAdminOrganicAds

@SuppressLint("ClickableViewAccessibility")
fun View.setOnAdminAdToggleListener(
    targetTapCount: Int = 10,
    tapTimeout: Long = 4000L,
    onAdminAdToggled: ((Boolean) -> Unit)? = null
) {
    var tapCount = 0
    val handler = Handler(Looper.getMainLooper())

    val resetTapCountRunnable = Runnable {
        tapCount = 0
    }

    this.setOnTouchListener { _, event ->
        if (event.action == MotionEvent.ACTION_DOWN) {
            handler.removeCallbacks(resetTapCountRunnable)
            tapCount++

            if (tapCount == targetTapCount) {
                tapCount = 0
                DialogAdminOrganicAds.setOnAdminAdToggleListener(onAdminAdToggled)
                DialogAdminOrganicAds.show(context)
            } else {
                handler.postDelayed(resetTapCountRunnable, tapTimeout)
            }
        }
        false
    }
}

internal fun View.click(action: (view: View?) -> Unit) {
    var lastClickTime = 0L
    setOnClickListener {
        if (SystemClock.elapsedRealtime() - lastClickTime < 300L) return@setOnClickListener
        lastClickTime = SystemClock.elapsedRealtime()
        action(it)
    }
}
