package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceOneImg: ImageView
    lateinit var diceTwoImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)

        diceOneImg = findViewById(R.id.dice_image)
        diceTwoImg = findViewById(R.id.dice_image_sceond)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice(){
        val randomNumber = (1..6).random()
        val randomNumber2 = (1..6).random()

        val image = when(randomNumber){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice_empty
            }

        val imageTwo  = when(randomNumber2){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        diceOneImg.setImageResource(image)

        diceTwoImg.setImageResource(imageTwo)
    }
}