package com.example.zillitandroid.views.activities

import android.os.Bundle
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.zillitandroid.Adapters.OnBoardingAdapter

import com.example.zillitandroid.R
import com.example.zillitandroid.models.OnboardingModel.OnBoardingDataModel


class OnBoardingScreen : AppCompatActivity() {


    private lateinit var onBoardingAdapter: OnBoardingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)
        supportActionBar!!.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.orange)
        setOnBoardingScreens()

    }

    private fun setOnBoardingScreens() {
        onBoardingAdapter = OnBoardingAdapter(listOf(
            OnBoardingDataModel(
                mainHeading = getString(R.string.mainOnBoardingHeading1),
                R.drawable.splash_1,
                getString(R.string.subOnBoardingHeadingOfOne1),
                getString(R.string.subOnBoardingHeadingOfOne2),
                R.drawable.corner_round_button,
                R.drawable.corner_round_button,
            ),
            OnBoardingDataModel(
                mainHeading = getString(R.string.mainOnBoardingHeading2),
                R.drawable.splash_2,
                getString(R.string.subOnBoardingHeadingOfTwo1),
                getString(R.string.subOnBoardingHeadingOfTwo2),
                R.drawable.corner_round_button,
                R.drawable.corner_round_button,
            ), OnBoardingDataModel(
                mainHeading = getString(R.string.mainOnBoardingHeading3),
                R.drawable.splash_3,
                getString(R.string.subOnBoardingHeadingOfThree1),
                getString(R.string.subOnBoardingHeadingOfThree2),
                R.drawable.corner_round_button,
                R.drawable.corner_round_button,
            ), OnBoardingDataModel(
                mainHeading = getString(R.string.mainOnBoardingHeading4),
                R.drawable.splash_4,
                getString(R.string.subOnBoardingHeadingOfFour1),
                getString(R.string.subOnBoardingHeadingOfFour2),
                R.drawable.corner_round_button,
                R.drawable.corner_round_button,
            ), OnBoardingDataModel(
                mainHeading = getString(R.string.mainOnBoardingHeading5),
                R.drawable.splash_5,
                getString(R.string.subOnBoardingHeadingOfFive1),
                getString(R.string.subOnBoardingHeadingOfFive2),
                R.drawable.corner_round_button,
                R.drawable.corner_round_button,
            ),
        ))
        val viewPager = findViewById<ViewPager2>(R.id.onBoardingContainer)
        viewPager.adapter = onBoardingAdapter
    }


}