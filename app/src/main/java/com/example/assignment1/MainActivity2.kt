package com.example.assignment1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener() {
            open3rdActivity()
        }
    }
        fun open3rdActivity(){
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
}



