package com.example.funfatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        //Esconder barra
        getSupportActionBar()?.hide();


        val buttonStats: Button = findViewById(R.id.btnStats)
        val buttonHowToPlay: Button = findViewById(R.id.btnHowToPlay)
        val buttonPlayFateco: Button = findViewById(R.id.btnPlay)


        buttonStats.setOnClickListener {
            val intent = Intent(this, StatsActivity::class.java);
            startActivity(intent)
        }

        buttonHowToPlay.setOnClickListener {
            val intent = Intent(this, HowPlayActivity::class.java);
            startActivity(intent)
        }

        buttonPlayFateco.setOnClickListener {
            val intent = Intent(this, FatecoActivity::class.java);
            startActivity(intent)
        }
    }
}