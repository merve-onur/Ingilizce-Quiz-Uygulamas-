package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class soruekrani8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soruekrani8)
        val keyboard : Button = findViewById(R.id.keyboard)
        val mouse : Button = findViewById(R.id.mouse)
        val webcam : Button = findViewById(R.id.webcam)
        val screen : Button = findViewById(R.id.screen)

        keyboard.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        webcam.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        screen.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        mouse.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap  ", Toast.LENGTH_SHORT).show()
            val mouse = Intent(this,soruekrani9::class.java)
            startActivity(mouse)
            finish()
        }
    }
}