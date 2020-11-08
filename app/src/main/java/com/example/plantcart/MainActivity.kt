package com.example.plantcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //login button
        //findViewById<Button>(R.id.button2).setOnClickListener{ loginButton()}
        findViewById<Button>(R.id.loginbtn).setOnClickListener {
            val usernameText = findViewById<EditText>(R.id.buttonlogin)
            val username = usernameText.text.toString();

            val passwordText = findViewById<EditText>(R.id.textPassword)
            val password = passwordText.text.toString();

            if (username.equals("Vanessa") && password.equals("gallydots")) {
                LoginPage()

            } else {
                Toast.makeText(this, "Incorrect username or password.", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun LoginPage() {
        val intent = Intent(this, MainPage::class.java)
        startActivity(intent)
        Toast.makeText(this, "You are logged in", Toast.LENGTH_SHORT).show()
    }
}