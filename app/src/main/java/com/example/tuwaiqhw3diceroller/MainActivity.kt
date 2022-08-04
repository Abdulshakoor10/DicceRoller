package com.example.tuwaiqhw3diceroller

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

        val rollButton : Button = findViewById(R.id.roll_btn)
//        val numberText : TextView = findViewById(R.id.number_txt)


        // button toast
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }







    }// End onCreate()

    private fun rollDice(){
        //create object
        val dice = Dice(6)
        // save the result number
        val diceRoll = dice.roll()

        // reference to imageView
        val diceImage : ImageView = findViewById(R.id.dice_img)


        when(diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }// End when
    }// End rollDice()

}