package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button1)
        button.setOnClickListener(){
            open2ndActivity()
        }

    }
    fun open2ndActivity(){
        val intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}