package com.example.funfatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HowPlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_play)

        //Esconder barra
        getSupportActionBar()?.hide();


        val buttonGoBack: ImageButton = findViewById(R.id.imgGoBackStatsButton)


        buttonGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
    }
}