package com.example.game

import android.content.Intent
import android.os.Bundle
import android.util.Log.d

import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bigButton.setOnClickListener {
            d( "maryana", "button was pressed!")
            startActivity(Intent(this, AboutMe::class.java))

        }

    }
}
