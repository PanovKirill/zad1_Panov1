package com.example.zad1_panov

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity4 : AppCompatActivity() {
    lateinit var txt:TextView
    lateinit var log: String
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        txt = findViewById(R.id.Text1)
        log = getIntent().getStringExtra("login").toString()
        txt.text = log.toString()
    }
}
