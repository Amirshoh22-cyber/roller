package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll: Button = findViewById(R.id.button)

        rollDice()

        buttonRoll.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val imageDice: ImageView = findViewById(R.id.imageView)
        val roll = dice.randomSides()
        val drawableResourse = when (roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageDice.setImageResource(drawableResourse)
        imageDice.contentDescription = roll.toString()
    }
}