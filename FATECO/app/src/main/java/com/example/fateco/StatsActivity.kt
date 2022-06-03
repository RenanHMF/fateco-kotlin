package com.example.funfatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.room.Room
import com.example.fateco.AppDatabase

class StatsActivity : AppCompatActivity() {
    lateinit var db: AppDatabase;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)


        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "banco.db").allowMainThreadQueries().build()

        val actualStats = db.dao().getStatsById()

        if (!actualStats.isNullOrEmpty()) {
            val carrerHigh: TextView = findViewById(R.id.carrerHigh)
            val gamesPlayed: TextView = findViewById(R.id.gamesPlayed)
            val gamesWon: TextView = findViewById(R.id.gamesWon)
            val streak: TextView = findViewById(R.id.streak)

            carrerHigh.text = actualStats[0].carrerHigh.toString()
            gamesPlayed.text = actualStats[0].gamesPlayed.toString()
            gamesWon.text = ((actualStats[0].gamesWon.toString().toInt() * 100) / (actualStats[0].gamesPlayed.toString().toInt())).toString() + "%"
            streak.text = actualStats[0].streak.toString()
        }



        //Esconder barra
        getSupportActionBar()?.hide();


        val buttonGoBack: ImageButton = findViewById(R.id.imgGoBackButton)

        buttonGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
    }
}