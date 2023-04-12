package com.example.praktikummodul3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialisasi
        val b_lanjut = findViewById<Button>(R.id.b_lanjut)
        b_lanjut.setOnClickListener{
            Intent(this, activity2::class.java).also{
                startActivity(it)
            }
        }

        //inisialisasi
        val b_coba: Button = findViewById(R.id.b_coba)

        b_coba.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ilovepdf.com"));
            startActivity(intent)
        }

        val openApk = findViewById<Button>(R.id.b_coba2)

        openApk.setOnClickListener {
            val intent = packageManager.getLaunchIntentForPackage("com.ilovepdf.www")
            if (intent != null){
                startActivity(intent)
            }else{
                val playStoreIntent = Intent(Intent.ACTION_VIEW)
                playStoreIntent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.ilovepdf.www")
                startActivity(playStoreIntent)
            }
        }
    }
}