package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun getMood(): String {
        return "Current mood is sad."
    }
}