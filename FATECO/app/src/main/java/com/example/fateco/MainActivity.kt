package com.example.fateco

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        val txtFATECO : TextView = findViewById(R.id.txtFATECO)
        val btnVerificarResposta : Button = findViewById(R.id.btnVerificarResposta)

        val letra0 : EditText = findViewById(R.id.letra0)
        val letra1 : EditText = findViewById(R.id.letra1)
        val letra2 : EditText = findViewById(R.id.letra2)
        val letra3 : EditText = findViewById(R.id.letra3)
        val letra4 : EditText = findViewById(R.id.letra4)

        btnVerificarResposta.setOnClickListener {
            val palavraSecreta = "FATEC"


            val listaPalavraTentada = mutableListOf<EditText>()

            listaPalavraTentada.add(letra0)
            listaPalavraTentada.add(letra1)
            listaPalavraTentada.add(letra2)
            listaPalavraTentada.add(letra3)
            listaPalavraTentada.add(letra4)

            val listaPalavraSecreta = mutableListOf<String>()
            for (i in 0 .. 4){
                listaPalavraSecreta.add(palavraSecreta[i].toString())
            }

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

                letra0.setKeyListener(null)
                letra1.setKeyListener(null)
                letra2.setKeyListener(null)
                letra3.setKeyListener(null)
                letra4.setKeyListener(null)
            }
        }

        letra0.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.length == 1) {
                    letra1.requestFocus()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
            }
        })

        letra1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.length == 1) {
                    letra2.requestFocus()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
            }
        })
        letra2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.length == 1) {
                    letra3.requestFocus()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
            }
        })

        letra3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.length == 1) {
                    letra4.requestFocus()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
            }
        })

    }
}