package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun getMood(): String {
        return "Current mood is Happy!"
    }
}