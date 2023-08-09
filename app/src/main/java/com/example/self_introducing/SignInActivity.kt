package com.example.self_introducing

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignInActivity : AppCompatActivity() {
    private lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity_main)

        val id = findViewById<EditText>(R.id.editTextTextEmailAddress)

        val password = findViewById<EditText>(R.id.editTextTextPassword)

        val button = findViewById<Button>(R.id.button)

        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                val user_id = it.data?.getStringExtra("id") ?:""
                val user_pw = it.data?.getStringExtra("password") ?:""
                //다른데에선 password라고 해놓고 여기엔pw라고 해서 비밀번호는 입력값을 받지 못함
                id.setText(user_id)
                password.setText(user_pw)
            }
        }

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
            activityResultLauncher.launch(intent)
//            startActivity(intent)
//            이게 있어서 회원가입 화면이 두번이 뜸
            Toast.makeText(this, "회원가입을 진행합니다.", Toast.LENGTH_SHORT).show()

        }
//            val intent = Intent(this, SignUpActivity::class.java)
    }
}



