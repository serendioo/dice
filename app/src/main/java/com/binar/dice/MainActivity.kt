package com.binar.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn = listOf<Button>(btn_p1,btn_p2,btn_p3)
        var player1score = 0
        var player2score = 0
        var player3score = 0
        var arrayScorePlayer = mutableListOf<Int>()
        val arrayDice = listOf(1, 2, 3, 4, 5, 6)
        val player1 = txt_username1.text.toString()
        val player2 = txt_username2.text.toString()
        val player3 = txt_username3.text.toString()

        val player = listOf(player1, player2, player3)
        var randomArray = 0

//        for (i in player) {
//                when (randomArray) {
//                    1, 3, 5 -> arrayScorePlayer[i] += 5
//                    2, 4, 6 -> score -= 3
//                }
//                Log.d("Score", score.toString())
//        }

        btn_dice.setOnClickListener {
            randomArray = arrayDice.random()
            Log.d("random", randomArray.toString())
            scorePlayer(randomArray)
            tv_score1.text = score.toString()
        }


    }

    private fun scorePlayer(randomArray: Int): Int {
        when (randomArray) {
            1, 3, 5 -> score += 5
            2, 4, 6 -> score -= 3
        }
        Log.d("Score", score.toString())

        return score
    }
    //5 rounde
    //player input nama
    // if 1,3,5 score +5
    // if 2,4,6 score -3
    //score tertinggi


}