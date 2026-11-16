package com.itg.devconfig.demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.itg.devconfig.demo.databinding.ActivityMainBinding
import com.itg.devconfig.utils.setOnAdminAdToggleListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tap Language 10 lần để mở DevConfig (giống production)
        binding.tvLanguage.setOnAdminAdToggleListener { unlimitedEnabled ->
            Toast.makeText(
                this,
                if (unlimitedEnabled) {
                    "Unlimited Ads ON — restart app to apply"
                } else {
                    "Unlimited Ads OFF — restart app to apply"
                },
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
