package com.example.self_introducing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeactivity)
        val textView6 = findViewById<TextView>(R.id.textView6)
        val getID = intent.getStringExtra("ID")
        textView6.text = "아이디: $getID"

        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            Toast.makeText(this, "로그인 화면으로 돌아갑니다.", Toast.LENGTH_SHORT).show()

            finish()
        }
    }
}
