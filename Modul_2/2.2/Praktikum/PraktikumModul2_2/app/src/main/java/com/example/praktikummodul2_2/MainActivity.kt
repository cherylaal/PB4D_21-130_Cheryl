package com.example.praktikummodul2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
    private fun init(){
        recyclerView = findViewById(R.id.recycler_view)
        var data = ArrayList<univ>()
        data.add(univ(R.drawable.ub,"Universitas Brawijaya", "Malang, Jawa Timur"))
        data.add(univ(R.drawable.ugm,"Universitas Gadjah Mada", "Yogyakarta"))
        data.add(univ(R.drawable.unej,"Universitas Jember", "Jember, Jawa Timur"))
        data.add(univ(R.drawable.unpad,"Universitas Padjajaran", "Jatinangor"))
        data.add(univ(R.drawable.ub,"Universitas Brawijaya", "Malang, Jawa Timur"))
        data.add(univ(R.drawable.ugm,"Universitas Gadjah Mada", "Yogyakarta"))
        data.add(univ(R.drawable.unej,"Universitas Jember", "Jember, Jawa Timur"))
        data.add(univ(R.drawable.unpad,"Universitas Padjajaran", "Jatinangor"))
        data.add(univ(R.drawable.ub,"Universitas Brawijaya", "Malang, Jawa Timur"))
        data.add(univ(R.drawable.ugm,"Universitas Gadjah Mada", "Yogyakarta"))
        data.add(univ(R.drawable.unej,"Universitas Jember", "Jember, Jawa Timur"))
        data.add(univ(R.drawable.unpad,"Universitas Padjajaran", "Jatinangor"))


        adapter = MyAdapter(data)
    }
}