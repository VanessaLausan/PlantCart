package com.example.plantcart

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat.startActivity

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        //login button
        findViewById<ImageButton>(R.id.imageButton12).setOnClickListener { backbutton () }
       // findViewById<Button>(R.id.goToShop).setOnClickListener { search () }
        //findViewById<ImageButton>(R.id.imageButton6).setOnClickListener { settings () }
        findViewById<ImageButton>(R.id.imageButton13).setOnClickListener { share () }
    }


    private fun backbutton() {
        val intent2 = Intent(this, MainActivity::class.java)
        startActivity(intent2)
    }
    //private fun gotocam() {
       // val intent2 = Intent(this, MainActivity::class.java)
        //startActivity(intent2)
   // }
    private fun search() {
        val uri = Uri.parse("https://www.google.com/search?q=succulent+plants&rlz=1C1CHBF_enPH882PH882&sxsrf=ALeKk02vwi2ApuKiVEKsONVxlFmmHrTfSg:1604676266997&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjco_72nO7sAhXUKqYKHebeAHEQ_AUoAXoECCsQAw&biw=1920&bih=880")
        val intent3 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent3)
    }
    //private fun settings() {
     //   val uri = Uri.parse("content://settings/apps/1")
     //   val intent = Intent(Intent.ACTION_VIEW, uri)
     //   startActivity(intent)
  //  }
    private fun share() {
        val uri = Uri.parse("content://settings/apps/1")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }


  }

