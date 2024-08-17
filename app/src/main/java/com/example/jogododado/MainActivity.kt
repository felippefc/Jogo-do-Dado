package com.example.jogododado

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private var ultimoValor = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val botao = findViewById<Button>(R.id.botao)
        val imagem = findViewById<ImageView>(R.id.imagem)

        botao.setOnClickListener {
            val numero = clicaBotao()
            when(numero){
                 1 -> imagem.setImageResource(R.drawable.dice1)
                 2 -> imagem.setImageResource(R.drawable.dice2)
                 3 -> imagem.setImageResource(R.drawable.dice3)
                 4 -> imagem.setImageResource(R.drawable.dice4)
                 5 -> imagem.setImageResource(R.drawable.dice5)
                 6 -> imagem.setImageResource(R.drawable.dice6)
            }
            if(numero == ultimoValor) {
                Toast.makeText(this, getString(R.string.valor_repetido),Toast.LENGTH_LONG).show()
            }
            ultimoValor = numero


        }
        }
    }


fun clicaBotao (): Int {
    val valor = (1..6).random()
    return valor
}

