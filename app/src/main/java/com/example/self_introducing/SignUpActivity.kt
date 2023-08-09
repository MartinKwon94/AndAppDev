package com.example.self_introducing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity)

//        val intent = Intent(this, HomeActivity::class.java)

        val editTextTextEmailAddress2 = findViewById<EditText>(R.id.editTextTextEmailAddress2)

        val editTextTextPassword2 = findViewById<EditText>(R.id.editTextTextPassword2)

        val editTextText = findViewById<EditText>(R.id.editTextText)

        val button2 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener {

            val intent = Intent(this, SignInActivity::class.java)
                .putExtra("id", editTextTextEmailAddress2.text.toString())
                .putExtra("password", editTextTextPassword2.text.toString())

            setResult(RESULT_OK, intent)

            if (editTextTextEmailAddress2.text.toString()
                    .isNotEmpty() && editTextTextPassword2.text.toString()
                    .isNotEmpty() && editTextText.text.toString().isNotEmpty()


            ) {
                Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show()
                finish()
            } else
                Toast.makeText(this, "다시 입력해주세요.", Toast.LENGTH_SHORT).show()
        }

    }

}
