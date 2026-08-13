package com.example.exp_4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        val username = intent.getStringExtra("USERNAME")
        val age = intent.getStringExtra("AGE")
        val email = intent.getStringExtra("EMAIL")

        tvUsername.text = "Username: $username"
        tvAge.text = "Age: $age"
        tvEmail.text = "Email: $email"
    }
}