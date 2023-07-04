package com.example.definelistener

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveDataButton = findViewById<Button>(R.id.saveDataButton)
        saveDataButton.setOnClickListener { }
    }
}