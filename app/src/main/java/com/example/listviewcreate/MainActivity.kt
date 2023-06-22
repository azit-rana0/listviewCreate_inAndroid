package com.example.listviewcreate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)

        val tastList = arrayListOf<String>("hello", "hkakjdfahj", "lkafjklafj", "ladjklah", "hafkjadfj",
                                            "jakajjk", "jklajkl", "ajkjkja", "kajajk", "alkajlk", "hjalds")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, tastList)
        listview.adapter = adapterForMyListView

        listview.setOnItemClickListener {parent, view, position, id ->

            val text = "Click on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

        }
    }
}