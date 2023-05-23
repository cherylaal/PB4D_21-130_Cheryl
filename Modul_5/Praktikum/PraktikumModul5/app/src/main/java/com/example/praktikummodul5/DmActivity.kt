package com.example.praktikummodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dm)
    }

    fun onBackPressed(view: View){
        onBackPressed()
    }
}