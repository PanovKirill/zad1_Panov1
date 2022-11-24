package com.example.zad1_panov

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}
class Spinner : AppCompatActivity () {
    lateinit var spin: Spinner
    lateinit var adapter: ArrayAdapter<String>

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var spin = findViewById<Spinner>(R.id.sp)
        ArrayAdapter.createFromResource(
            this,
            R.array.catNames,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
            )

            spin.adapter = adapter
        }
    }
}