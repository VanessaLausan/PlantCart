package com.example.plantcart

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        findViewById<ImageButton>(R.id.backbtn).setOnClickListener { backbutton() }
        findViewById<Button>(R.id.browsebtn).setOnClickListener { search() }
        findViewById<ImageButton>(R.id.imagebtn).setOnClickListener { Image() }
        findViewById<Button>(R.id.messagebtn).setOnClickListener { message() }
        findViewById<ImageButton>(R.id.settingsbtn).setOnClickListener { Settings() }
        findViewById<ImageButton>(R.id.sharebtn).setOnClickListener { share() }
    }

    //first 3 buttons will run successfully
    private fun backbutton() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun search() {
        val uri = Uri.parse("https://www.google.com/search?q=succulent+plants&rlz=1C1CHBF_enPH882PH882&sxsrf=ALeKk02vwi2ApuKiVEKsONVxlFmmHrTfSg:1604676266997&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjco_72nO7sAhXUKqYKHebeAHEQ_AUoAXoECCsQAw&biw=1920&bih=880")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    val REQUEST_IMAGE_GET = 1
    fun Image() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "image/*"
        }
        startActivityForResult(intent, REQUEST_IMAGE_GET)
    }

    private fun message() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        startActivity(intent)
    }

    //next 2 buttons will fail
    private fun Settings() {
        val intent = Intent(Settings.ACTION_SETTINGS)
        intent.addCategory(Intent.ACTION_ALL_APPS)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "Cannot open SETTINGS.", Toast.LENGTH_SHORT).show()
        }
    }
    private fun share() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "Cannot open SHARE.", Toast.LENGTH_SHORT).show()
        }
    }

}


