package com.example.capstonengaksoro.ui.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonengaksoro.R
import com.example.capstonengaksoro.databinding.ActivityPilihKuisBinding
import com.example.capstonengaksoro.utils.changeActivity

class PilihKuisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPilihKuisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPilihKuisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.test_quiz)


        binding.kuisMembacaCard.setOnClickListener {
            changeActivity(this, MembacaKuisActivity::class.java)
        }

        binding.kuisMenulisCard.setOnClickListener {
            changeActivity(this, MenulisKuisActivity::class.java)

        }


    }
}