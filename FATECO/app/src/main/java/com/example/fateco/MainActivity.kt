package com.example.fateco

import android.graphics.Color
import android.graphics.PorterDuff
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
            val palavraSecreta = "FATEC"

            val letra0 : EditText = findViewById(R.id.letra0)
            val letra1 : EditText = findViewById(R.id.letra1)
            val letra2 : EditText = findViewById(R.id.letra2)
            val letra3 : EditText = findViewById(R.id.letra3)
            val letra4 : EditText = findViewById(R.id.letra4)

            /*var palavraTentada = letra0.text.toString() + letra1.text.toString() +
                                 letra2.text.toString() + letra3.text.toString() +
                                 letra4.text.toString()*/

            val listaPalavraTentada = mutableListOf<EditText>()

            listaPalavraTentada.add(letra0)
            listaPalavraTentada.add(letra1)
            listaPalavraTentada.add(letra2)
            listaPalavraTentada.add(letra3)
            listaPalavraTentada.add(letra4)

            //var listaPalavraTentada = palavraTentada.toList()

            val listaPalavraSecreta = mutableListOf<String>()
            listaPalavraSecreta.add(palavraSecreta[0].toString())
            listaPalavraSecreta.add(palavraSecreta[1].toString())
            listaPalavraSecreta.add(palavraSecreta[2].toString())
            listaPalavraSecreta.add(palavraSecreta[3].toString())
            listaPalavraSecreta.add(palavraSecreta[4].toString())

            for (i in 0 .. 4){
                if (listaPalavraTentada[i].text.toString() in listaPalavraSecreta && listaPalavraTentada[i].text.toString() == listaPalavraSecreta[i]){
                    listaPalavraTentada[i].setBackgroundColor(Color.GREEN)
                    listaPalavraTentada[i].setTextColor(Color.BLACK)
                } else if(listaPalavraTentada[i].text.toString() in listaPalavraSecreta){
                    listaPalavraTentada[i].setBackgroundColor(Color.YELLOW)
                    listaPalavraTentada[i].setTextColor(Color.BLACK)
                } else {
                    listaPalavraTentada[i].setBackgroundColor(Color.RED)
                    listaPalavraTentada[i].setTextColor(Color.BLACK)
                }
            }
        }
    }
}