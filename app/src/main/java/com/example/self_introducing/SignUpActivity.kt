package com.example.self_introducing

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity)

        val button2 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener{
            finish()
            Toast.makeText(this, "회원가입완료.", Toast.LENGTH_SHORT).show()
        }

    }
}