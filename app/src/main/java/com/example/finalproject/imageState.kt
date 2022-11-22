package com.example.finalproject

import android.service.carrier.CarrierIdentifier

// Data for image states
data class imageState(val identifier: Int, var isFaceUP: Boolean = false, var isMatched: Boolean = false) {
}