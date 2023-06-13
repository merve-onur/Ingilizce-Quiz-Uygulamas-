package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class soruekrani6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soruekrani6)
        val kitchen : Button = findViewById(R.id.kitchen)
        val country : Button = findViewById(R.id.country)
        val home : Button = findViewById(R.id.home)
        val city : Button = findViewById(R.id.city)

        kitchen.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        country.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        city.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        home.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap  ", Toast.LENGTH_SHORT).show()
            val home = Intent(this,soruekrani8::class.java)
            startActivity(home)
            finish()
        }
    }
}