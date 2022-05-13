package com.example.fateco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        val txtFATECO : TextView = findViewById(R.id.txtFATECO)
        val btnVerificarResposta : Button = findViewById(R.id.btnVerificarResposta)

        btnVerificarResposta.setOnClickListener {
            val letra0palavra1 : EditText = findViewById(R.id.letra0palavra1)
            val letra1palavra1 : EditText = findViewById(R.id.letra1palavra1)
            val letra2palavra1 : EditText = findViewById(R.id.letra2palavra1)
            val letra3palavra1 : EditText = findViewById(R.id.letra3palavra1)
            val letra4palavra1 : EditText = findViewById(R.id.letra4palavra1)

            var palavraTentada = letra0palavra1.text.toString() + letra1palavra1.text.toString() +
                    letra2palavra1.text.toString() + letra3palavra1.text.toString() +
                    letra4palavra1.text.toString()

            val toast = Toast.makeText(this, "${palavraTentada}", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}