package com.example.hackathonn.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hackathonn.MainActivity
import com.example.hackathonn.R
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlogin = findViewById<Button>(R.id.btn_login)

        btnlogin.setOnClickListener(){
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }


    }
}