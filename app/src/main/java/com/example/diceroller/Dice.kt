package com.example.diceroller

class Dice(val sides: Int) {
    fun randomSides(): Int = (1..sides).random()
}