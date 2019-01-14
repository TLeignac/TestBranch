package com.example.thoma.test

import java.util.*
import kotlin.concurrent.schedule
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*goButton.setOnClickListener {
            val next = Intent(this@MainActivity, NextActivity::class.java)
            next.putExtra("textTest", titre.text.toString())
            Timer().schedule(10000) {
                startActivity(next)
            }
        }*/

       cochon.startAnimation(TranslateAnimation(0f, 0f, 0f, -650f).apply {
            setFillAfter(true)
            duration = 5000
        })
        System.out.print("git c'est trop cool")
    }
}

