package com.example.zillitandroid.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.zillitandroid.R
import com.example.zillitandroid.databinding.ActivitySplashBinding
import java.util.*
import kotlin.concurrent.schedule


class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        supportActionBar!!.hide()
        moveToNextScreen()

    }

    private fun moveToNextScreen(){
        Timer().schedule(3000){
            startActivity(Intent(this@SplashActivity,OnBoardingScreen::class.java))
        }
    }


}