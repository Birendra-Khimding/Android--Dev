package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // Hiding Action Bar
        supportActionBar?.hide()
        //Easy.kt Activity
        binding.button.setOnClickListener(){
            val intent = Intent(this, Easy::class.java)
            startActivity(intent)
        }
        //Medium.kt Activity
        binding.button2.setOnClickListener(){
            val intent2 = Intent(this, Medium::class.java)
            startActivity(intent2)

        }
        //Hard.kt Activity
        binding.button3.setOnClickListener(){
            val intent3 = Intent(this, Hard::class.java)
            startActivity(intent3)
        }

    }
}