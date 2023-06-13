package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class soruekrani4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soruekrani4)
        val pazar : Button = findViewById(R.id.pazar)
        val pazartesi : Button = findViewById(R.id.pazartesi)
        val sali : Button = findViewById(R.id.sali)
        val cuma : Button = findViewById(R.id.cuma)

        pazar.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        pazartesi.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        cuma.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        sali.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap  ", Toast.LENGTH_SHORT).show()
            val sali = Intent(this,soruekrani5::class.java)
            startActivity(sali)
            finish()
        }
    }
}