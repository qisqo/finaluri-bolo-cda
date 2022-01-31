package com.example.finaluri8cda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity2 : AppCompatActivity() {
    private lateinit var textViewSecond2 : TextView
    private lateinit var textViewFirst2 : TextView
    private lateinit var imageViewpaper2 : ImageView
    private lateinit var imageViewscissor2 : ImageView
    private lateinit var imageViewrock2 : ImageView
    private lateinit var imageViewRock : ImageView
    private lateinit var imageViewscissor: ImageView
    private lateinit var imageViewpaper : ImageView
    private lateinit var buttonRock : Button
    private lateinit var buttonRock2 : Button
    private lateinit var buttonPaper : Button
    private lateinit var buttonPaper2 : Button
    private lateinit var buttonScissors : Button
    private lateinit var buttonScissors2 : Button
    private lateinit var textViewFirst : TextView
    private lateinit var textViewSecond : TextView
    private lateinit var buttonReset2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)
        init()
        registerListeners()
    }
    private fun init() {
        textViewSecond2 = findViewById(R.id.textViewSecond2)
        textViewFirst2 = findViewById(R.id.textViewFirst2)
        imageViewpaper2 =findViewById(R.id.imageViewpaper2)
        imageViewscissor2 = findViewById(R.id.imageViewscissor2)
        imageViewrock2 = findViewById(R.id.imageViewrock2)
        imageViewRock = findViewById(R.id.imageViewRock)
        imageViewscissor = findViewById(R.id.imageViewscissor)
        imageViewpaper =findViewById(R.id.imageViewpaper)
        buttonRock = findViewById(R.id.buttonRock)
        buttonRock2 = findViewById(R.id.buttonRock2)
        buttonPaper = findViewById(R.id.buttonPaper)
        buttonPaper2= findViewById(R.id.buttonPaper2)
        buttonScissors = findViewById(R.id.buttonScissors)
        buttonScissors2 = findViewById(R.id. buttonScissors2)
        textViewFirst = findViewById(R.id.textViewFirst)
        textViewSecond = findViewById(R.id.textViewSecond)
        buttonReset2 = findViewById(R.id.buttonReset2)


    }
    private fun registerListeners() {
        buttonRock.setOnClickListener {
            imageViewRock.visibility = View.VISIBLE
        }
        buttonRock2.setOnClickListener {
            imageViewrock2.visibility = View.VISIBLE
        }
        buttonPaper.setOnClickListener {
            imageViewpaper.visibility = View.VISIBLE
        }
        buttonPaper2.setOnClickListener {
            imageViewpaper2.visibility = View.VISIBLE
        }
        buttonScissors.setOnClickListener {
            imageViewscissor.visibility = View.VISIBLE
        }
        buttonScissors2.setOnClickListener {
            imageViewscissor2.visibility = View.VISIBLE
        }
        buttonReset2.setOnClickListener {
            imageViewRock.visibility = View.INVISIBLE
            imageViewrock2.visibility = View.INVISIBLE
            imageViewpaper.visibility = View.INVISIBLE
            imageViewpaper2.visibility = View.INVISIBLE
            imageViewscissor.visibility = View.INVISIBLE
            imageViewscissor2.visibility = View.INVISIBLE

        }


    }
}