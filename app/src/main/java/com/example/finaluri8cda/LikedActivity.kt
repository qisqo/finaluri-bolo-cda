package com.example.finaluri8cda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LikedActivity : AppCompatActivity() {
    private lateinit var imageView3 : ImageView
    private lateinit var imageView4 : ImageView
    private lateinit var imageView5 : ImageView
    private lateinit var imageView6 : ImageView
    private lateinit var buttonLink : Button
    private lateinit var buttonLink2 : Button
    private lateinit var buttonLink3 : Button
    private lateinit var buttonLink4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liked)
        init()
        registerListeners()
    }
    private fun init() {
        imageView3 = findViewById(R.id.imageView3)
        imageView4 = findViewById(R.id.imageView4)
        imageView5 = findViewById(R.id.imageView5)
        imageView6 = findViewById(R.id.imageView7)
        buttonLink = findViewById(R.id.buttonLink)
        buttonLink2 = findViewById(R.id.buttonLink2)
        buttonLink3 = findViewById(R.id.buttonLink3)
        buttonLink4 = findViewById(R.id.buttonLink4)

    }
    private fun registerListeners() {
        buttonLink.setOnClickListener {
            val url = "https://store.steampowered.com/agecheck/app/782330/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        buttonLink2.setOnClickListener {
            val url = "https://store.steampowered.com/agecheck/app/217980/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        buttonLink3.setOnClickListener {
            val url = "https://store.steampowered.com/app/292030/The_Witcher_3_Wild_Hunt/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        buttonLink4.setOnClickListener {
            val url = "https://fallout.bethesda.net/en/games/fallout-new-vegas"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

    }
}