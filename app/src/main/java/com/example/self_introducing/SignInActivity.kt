package com.example.self_introducing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "로그인 하셨습니다.", Toast.LENGTH_SHORT).show()
        }


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "회원가입한다.", Toast.LENGTH_SHORT).show()
        }

    }
}
