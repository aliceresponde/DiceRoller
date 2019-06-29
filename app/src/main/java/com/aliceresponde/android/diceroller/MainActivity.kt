package com.aliceresponde.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener {
            result_textview.text = rollDiceStandar().toString()
        }
    }

    private fun rollDice(): String = (1..6).shuffled().first().toString()
    private fun rollDiceStandar() = Random().nextInt(6) + 1
}
