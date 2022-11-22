package com.muffakir.programmerthoughts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muffakir.programmerthoughts.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
