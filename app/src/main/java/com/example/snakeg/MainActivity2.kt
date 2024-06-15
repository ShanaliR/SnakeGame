package com.example.snakeg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn2 = findViewById(R.id.btn2)

        btn2.setOnClickListener {
            welcome()
            openActivity3()
        }
    }

    private fun openActivity3() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    public fun welcome(){
        Toast.makeText(this,"Welcome to Snake Quest!", Toast.LENGTH_LONG).show()
    }
}
