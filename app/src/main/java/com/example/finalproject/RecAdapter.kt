package com.example.finalproject

import android.nfc.Tag
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlin.coroutines.coroutineContext
import kotlin.math.min


class RecAdapter(val num: Int, val stateImage: List<imageState>, val wth: Int, val hgt: Int): RecyclerView.Adapter<RecAdapter.ViewHolder>() {

    private var singleImage: Int? = null
    

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgButton = itemView.findViewById<ImageButton>(R.id.imageButton)



        //ImageButton click (faceUP and faceDown)
        fun bind(position: Int) {
            imgButton.setImageResource(if (stateImage[position].isFaceUP) stateImage[position].identifier
                else R.drawable.ic_launcher_foreground)
            imgButton.alpha = if(stateImage[position].isMatched) .7f else 1.0f
            imgButton.setOnClickListener() {
                notifyDataSetChanged()
                flipCard(position)
            }
        }
        //Game logic
        fun flipCard(position: Int){
            val img = stateImage[position]
            if(img.isFaceUP){
                return
            }

            if (singleImage == null) {
                restoreCards()
                singleImage = position
            } else {
               checkMatch(singleImage!!, position)
                singleImage = null
            }
            img.isFaceUP = !img.isFaceUP
        }

        fun checkMatch(position1: Int, position2: Int) {
           if (stateImage[position1].identifier == stateImage[position2].identifier) {

              stateImage[position1].isMatched = true
               stateImage[position2].isMatched = true
         }
        }
         fun restoreCards() {
            for(img in stateImage){
                if(!img.isMatched){
                    img.isFaceUP = false
                }
            }
        }



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //parameter of imageButton
        val cardWidth = parent.width / wth
        val cardHeight = parent.height / hgt
        val cSideLength = min(cardWidth, cardHeight)
        //adding imageButton to recycleView
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_button,parent,false)
        // imageButton layoutParameter
        var layoutPar = view.findViewById<CardView>(R.id.cardView).layoutParams
        layoutPar.width = cSideLength
        layoutPar.height = cSideLength
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return num
    }
}






