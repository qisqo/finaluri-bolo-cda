package com.example.finaluri8cda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChooseActivity : AppCompatActivity() {
    private lateinit var ChooseGames: TextView
    private lateinit var buttonMyGames: Button
    private lateinit var buttonLikedGames: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        init()
        registerListeners()
    }

    private fun init(){
        ChooseGames = findViewById(R.id.ChooseGames)
        buttonMyGames = findViewById(R.id.buttonMyGames)
        buttonLikedGames = findViewById(R.id.buttonLikedGames)
    }
    private fun registerListeners() {
        buttonMyGames.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        buttonLikedGames.setOnClickListener {
            val intent = Intent(this, LikedActivity::class.java)
            startActivity(intent)
        }
    }
}