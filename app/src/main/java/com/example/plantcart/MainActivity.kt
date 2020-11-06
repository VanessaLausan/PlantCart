package com.example.plantcart

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //login button
        findViewById<Button>(R.id.button2).setOnClickListener{ loginButton()}
        findViewById<Button>(R.id.button2).setOnClickListener{ backdashboard()}
    }

    private fun loginButton() {
        val intent = Intent(this, MainPage::class.java)
        startActivity(intent)
      }
    private fun backdashboard() {
        val intent3 = Intent(this,MainPage::class.java)
        startActivity(intent3)
    }

}