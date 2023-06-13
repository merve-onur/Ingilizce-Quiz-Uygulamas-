package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class soruekrani2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soruekrani2)
        val pink : Button = findViewById(R.id.pink)
        val purple : Button = findViewById(R.id.purple)
        val blue : Button = findViewById(R.id.blue)
        val yellow : Button = findViewById(R.id.yellow)

        pink.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        blue.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        yellow.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        purple.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap  ", Toast.LENGTH_SHORT).show()
            val purple = Intent(this,soruekrani3::class.java)
            startActivity(purple)
            finish()
        }
    }
}