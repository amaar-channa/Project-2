package com.example.project_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_2.databinding.ActivityDisplayTextBinding

class DisplayTextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        binding.nameTextView.text = message ?: ""
    }
}