package com.takehomeexcercise.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.takehomeexcercise.databinding.ActivityListingBinding

class ListingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}