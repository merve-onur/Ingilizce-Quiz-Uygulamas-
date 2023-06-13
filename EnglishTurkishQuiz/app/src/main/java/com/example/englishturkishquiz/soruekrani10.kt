package com.example.englishturkishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class soruekrani10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soruekrani10)
        val young : Button = findViewById(R.id.young)
        val old : Button = findViewById(R.id.old)
        val small : Button = findViewById(R.id.small)
        val tall : Button = findViewById(R.id.tall)


        young.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        tall.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        small.setOnClickListener{
            Toast.makeText(applicationContext,"Yanlış Cevap Tekrar Dene ", Toast.LENGTH_SHORT).show()

        }
        old.setOnClickListener{
            Toast.makeText(applicationContext,"Tebrikler! Doğru Cevap  ", Toast.LENGTH_SHORT).show()
            val old = Intent(this,sonsayfa::class.java)
            startActivity(old)
            finish()
        }
    }
}