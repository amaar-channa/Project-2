package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeTextBtn.setOnClickListener {
            binding.changeTextView.text = binding.changeEditText.text.toString()

        }

        binding.openActivityBtn.setOnClickListener {
            val message = binding.changeEditText.text.toString()
            val intent = Intent(this, DisplayTextActivity::class.java).apply {
                putExtra("EXTRA_MESSAGE", message)
            }

            startActivity(intent)
        }
    }
}