package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SoruEkrani1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soru_ekrani1)
        val kedibtn : Button = findViewById(R.id.kedibtn)
        val tavsanbtn : Button = findViewById(R.id.tavsanbtn)
        val kopekbtn : Button = findViewById(R.id.kopekbtn)
        val kusbtn : Button = findViewById(R.id.kusbtn)

        kedibtn.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap! Tekrar Deneyin ", Toast.LENGTH_SHORT).show()

        }
        kopekbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap! Tekrar Deneyin ", Toast.LENGTH_SHORT).show()

        }
        kusbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap! Tekrar Deneyin ", Toast.LENGTH_SHORT).show()

        }
        tavsanbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap   ", Toast.LENGTH_SHORT).show()
            val soruekrani = Intent(this,soruekrani2::class.java)
            startActivity(soruekrani)
            finish()
        }

    }
}