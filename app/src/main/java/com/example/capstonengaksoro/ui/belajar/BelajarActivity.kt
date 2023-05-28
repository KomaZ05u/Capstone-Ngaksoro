package com.example.capstonengaksoro.ui.belajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.capstonengaksoro.R
import com.example.capstonengaksoro.databinding.ActivityBelajarBinding
import com.example.capstonengaksoro.ui.ViewModelFactory

class BelajarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBelajarBinding
    private val factory: ViewModelFactory by lazy {
        ViewModelFactory.getInstance(this.application)
    }
    private val belajarViewModel: BelajarViewModel by viewModels {
        factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBelajarBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.recyclerView.layoutManager = GridLayoutManager(this, 3)

        belajarViewModel.getData().observe(this, { response ->
            if (response != null) {
                val adapter = BelajarAdapter(response.images)
                binding.recyclerView.adapter = adapter
            }
        })
    }
}
