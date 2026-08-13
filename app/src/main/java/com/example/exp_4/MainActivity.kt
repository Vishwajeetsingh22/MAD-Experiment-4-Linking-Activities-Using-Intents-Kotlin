package com.example.exp_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.etUsername)
        val age = findViewById<EditText>(R.id.etAge)
        val email = findViewById<EditText>(R.id.etEmail)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {

            val name = username.text.toString()
            val userAge = age.text.toString()
            val userEmail = email.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("USERNAME", name)
            intent.putExtra("AGE", userAge)
            intent.putExtra("EMAIL", userEmail)

            startActivity(intent)
        }
    }
}