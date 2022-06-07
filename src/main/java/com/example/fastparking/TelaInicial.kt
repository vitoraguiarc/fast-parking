package com.example.fastparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)


        var button = findViewById<ImageView>(R.id.buttonHome)
        button.setOnClickListener {
            var intent = Intent(this, ValorCliente::class.java)
            startActivity(intent)
        }
    }
}