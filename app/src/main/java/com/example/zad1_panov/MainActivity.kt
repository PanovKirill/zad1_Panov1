package com.example.zad1_panov

import android.bluetooth.le.AdvertiseSettings
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    public final var APP_PREFERENS = "mysettings";
    public var PREF_NAME = "Name";
    lateinit var settings: SharedPreferences
    private lateinit var nameBox: EditText
    lateinit var nameView: TextView
    public var name = ""

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settings = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
    }
    fun SaveName(view: View){
        nameBox=findViewById(R.id.editText)
        name = nameBox.getText().toString();
        var prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }
    public fun getName(view: View){
        nameView=findViewById(R.id.editText)
        var name = settings.getString(PREF_NAME,"неопределено")
        nameView.setText(name)
        nameBox = findViewById(R.id.editText);
        nameBox.setText(name)
    }

    fun randomMe(view: View){
        nameBox = findViewById(R.id.editText);
    var nm =nameBox.text.toString()
    var randomIntent = Intent(this, MainActivity4::class.java)
        randomIntent.putExtra("login",nm)
        startActivity(randomIntent)
    }
}

