package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage   : ImageView
    lateinit var diceImsage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roolButton: Button = findViewById(R.id.roll_button)
        // val resultText: TextView = findViewById(R.id.result_text)
        diceImage = findViewById(R.id.dice_image)
        diceImsage2 = findViewById(R.id.dice_image2)

        //  val BTNcount: Button = findViewById(R.id.btnCount)

        roolButton.setOnClickListener {
            //  resultText.text = "Dice Rolled!"
            var randomInt: Int = (1..6).random()

            //  resultText.text = randomInt.toString()
            ChangeDadu(randomInt)
            getRandomDiceImage()


        }


        /*var angkaDadu = 0
        BTNcount.setOnClickListener {
            angkaDadu++
            if (angkaDadu <= 6) {
                ChangeDadu(angkaDadu)
            }
        }
         */

    }


    private fun rollDice(now: Int) {
        Toast.makeText(
            this,
            "kocokan dadu  dengan angka : $now",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun ChangeDadu(Dadu: Int) { // dadu atas
        val drawableResource = when (Dadu) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        rollDice(Dadu)
    }


    fun getRandomDiceImage() : Int {    //dadu bawah
        val random = (1..6).random()

            val drawableResource = when (random) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImsage2.setImageResource(drawableResource)

        return random
    }
}




