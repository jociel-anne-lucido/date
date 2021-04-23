package com.example.sleepgraphyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    val SPLASH_SCREEN = 5000

    private lateinit var logoAnimation: Animation
    private lateinit var textAnimation: Animation
    private lateinit var subtitleAnimation: Animation

    private lateinit var logoView: ImageView
    private lateinit var textView: ImageView
    private lateinit var subtitleView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()

        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation)
        textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation)
        subtitleAnimation = AnimationUtils.loadAnimation(this, R.anim.subtitle_animation)

        logoView = findViewById(R.id.ss_logo)
        textView = findViewById(R.id.ss_title)
        subtitleView = findViewById(R.id.ss_subtitle)

        logoView.animation = logoAnimation
        textView.animation = textAnimation
        subtitleView.animation = subtitleAnimation

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }
}