package com.example.capstonengaksoro.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.capstonengaksoro.databinding.ActivityHomeBinding
import com.example.capstonengaksoro.ui.belajar.BelajarActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.modulBelajar.setOnClickListener {
            val intent = Intent(this, BelajarActivity::class.java)
            startActivity(intent)
        }
    }
}