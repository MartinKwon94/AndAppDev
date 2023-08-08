package com.example.self_introducing

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher

class SignInActivity : AppCompatActivity() {

//    private lateinit var resultLauncher: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity_main)

        val id = findViewById<EditText>(R.id.editTextTextEmailAddress)

        val password = findViewById<EditText>(R.id.editTextTextPassword)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
//            val intent = Intent(this, SignUpActivity::class.java)
//            resultLauncher.launch(intent)
            if (id.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {

                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("ID", id.text.toString())
                Toast.makeText(this, "로그인!", Toast.LENGTH_SHORT).show()
                startActivity(intent)

            } else
                Toast.makeText(this, "다시 입력해주세요.", Toast.LENGTH_SHORT).show()
        }


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "회원가입을 진행합니다.", Toast.LENGTH_SHORT).show()
        }
    }
}



// @@@내일 해볼것 리스트@@@
// 1. 회원가입한 정보로만 로그인 할 수 있게 만들기
// 2. 버튼에 이미지 삽입하기