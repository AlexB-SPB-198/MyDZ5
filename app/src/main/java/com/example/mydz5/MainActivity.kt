package com.example.mydz5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydz5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var count = 0
    private var check: Boolean = false

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonPlus.setOnClickListener {
            count()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun count() {
        if (count in 0..9 && !check) {
            count++
            binding.tvCount.text = count.toString()
            if (count == 10) {
                check = true
            }
            if (count == 10){
                binding.buttonPlus.text = "-1"
            }
        } else if (count in 10 downTo 1) {
            count--
            binding.tvCount.text = count.toString()
        } else {
            binding.tvCount.text = "OpenNewActivity"
            val element = binding.tvCount.text
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key1", element)
            startActivity(intent)
        }
    }




}