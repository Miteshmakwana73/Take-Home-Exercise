package com.takehomeexcercise.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.takehomeexcercise.R
import com.takehomeexcercise.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.concurrent.schedule

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindAnimation()
        initUI()
    }

    /**
     * Add animation to imageview
     */
    private fun bindAnimation() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.image_anim);
        binding.imgSplash.animation = anim
    }

    /**
     * Add a timer for 3 seconds for splash screen
     */
    private fun initUI() {
        Timer().schedule(3000) {
            startActivity(Intent(this@SplashActivity, ListingActivity::class.java))
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.imgSplash.clearAnimation()
    }
}