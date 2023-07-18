package com.example.chatapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    private lateinit var imgLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        imgLogo = findViewById(R.id.img_splash_screen)
        val sideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        imgLogo.startAnimation(sideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this,LoginPage::class.java))
            finish()
        },2000)

    }
}