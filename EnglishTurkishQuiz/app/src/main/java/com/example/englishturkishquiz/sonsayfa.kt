package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class sonsayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonsayfa)
        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener{
            Toast.makeText(applicationContext,"Tekrar Hoşgeldiniz  :)", Toast.LENGTH_SHORT).show()
            val how = Intent(this,MainActivity::class.java)
            startActivity(how)
            finish()
        }
    }
}