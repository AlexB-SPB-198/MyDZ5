package com.example.mydz5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydz5.databinding.SecondActivityBinding

class SecondActivity  : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val arguments = intent.extras
        val name = arguments?.get("key").toString()
        binding.textview.text = name
    }


}