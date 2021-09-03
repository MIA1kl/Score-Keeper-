package com.android.scorekeeper


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var scoreTeamA = 0
    var scoreTeamB = 0

    fun addOneForTeamA (view: View) {
        scoreTeamA += 1
        displayForTeamA(scoreTeamA)
    }


    fun addTwoForTeamA (view: View) {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }


    fun addThreeForTeamA (view: View) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }


    fun displayForTeamA(score: Int) {
        val scoreView: TextView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    fun addOneForTeamB (view: View) {
        scoreTeamB += 1
        displayForTeamB(scoreTeamB)
    }



    fun addTwoForTeamB (view: View) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }


    fun addThreeForTeamB (view: View) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }


    fun displayForTeamB(score: Int) {
        val scoreView: TextView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }

    fun resetScore(view: View){
        scoreTeamB=0
        scoreTeamA=0
        displayForTeamB(scoreTeamB)
        displayForTeamA(scoreTeamA)
    }









}