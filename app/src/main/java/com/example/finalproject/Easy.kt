package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ActivityEasyBinding
import com.example.finalproject.R.drawable.*

class Easy : AppCompatActivity() {
    private lateinit var binding: ActivityEasyBinding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEasyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Action bar Name and back Navigation to Main Activity
        val actionbar = supportActionBar
        actionbar!!.title = "Easy"
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Adding images
        val images = mutableListOf(aeroplane, android, bell, cup)
        // Duplicating images and shuffling
        val randImages = (images + images).shuffled()
        val stateImage = randImages.map { imageState(it) }

        //Recycle View
         recyclerView = binding.recView
         recyclerView.adapter = RecAdapter(8, stateImage, 2,4)
         recyclerView.setHasFixedSize(true)
         recyclerView.layoutManager = GridLayoutManager(this,2)
        }

}
