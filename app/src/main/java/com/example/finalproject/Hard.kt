package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R.drawable.*
import com.example.finalproject.databinding.ActivityEasyBinding

class Hard : AppCompatActivity() {
    private lateinit var binding: ActivityEasyBinding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEasyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionbar = supportActionBar
        actionbar!!.title = "Hard"
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Adding images
        val images = mutableListOf(aeroplane, android, bell, cup, dumbel,face,
            flag, headset, house
        )
        // Duplicating images and shuffling
        val randImages = (images + images).shuffled()
        val stateImage = randImages.map { imageState(it) }



        recyclerView = binding.recView

        recyclerView.adapter = RecAdapter(18, stateImage,3,6)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this,3)
    }
}