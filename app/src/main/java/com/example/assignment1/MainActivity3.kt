package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener() {
            open1stActivity()
    }
}





    fun open1stActivity(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}

