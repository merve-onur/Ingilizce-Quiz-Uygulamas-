package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grsbtn : Button = findViewById(R.id.baslabtn)


        grsbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Hoşgeldiniz ", Toast.LENGTH_SHORT).show()
            val soruekrani = Intent(this,SoruEkrani1::class.java)
            startActivity(soruekrani)
            finish()
        }
    }
}