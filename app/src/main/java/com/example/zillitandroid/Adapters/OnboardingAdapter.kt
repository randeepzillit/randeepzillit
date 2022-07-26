package com.example.zillitandroid.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zillitandroid.R
import com.example.zillitandroid.models.OnboardingModel.OnBoardingDataModel

class OnBoardingAdapter(private val onBoardingList: List<OnBoardingDataModel>) :
    RecyclerView.Adapter<OnBoardingAdapter.OnBoardingItemViewHolder>() {
    inner class OnBoardingItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val mainHeading = view.findViewById<TextView>(R.id.mainHeading)
        private val mainImage = view.findViewById<ImageView>(R.id.mainImage)
        private val subHeading1 = view.findViewById<TextView>(R.id.subHeading1)
        private val subHeading2 = view.findViewById<TextView>(R.id.subHeading2)
        private val subIcon1 = view.findViewById<ImageView>(R.id.subIcon1)
        private val subIcon2 = view.findViewById<ImageView>(R.id.subIcon2)
        fun onBind(onBoarding: OnBoardingDataModel) {
            mainHeading.text = onBoarding.mainHeading
            mainImage.setImageResource(onBoarding.mainImage)
            subHeading1.text = onBoarding.subHeading1
            subHeading2.text = onBoarding.subHeading2
            subIcon1.setImageResource(onBoarding.subIcon1)
            subIcon2.setImageResource(onBoarding.subIcon2)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingItemViewHolder {
        return OnBoardingItemViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.onboarding_view_container, parent, false))
    }


    override fun onBindViewHolder(holder: OnBoardingItemViewHolder, position: Int) {
        holder.onBind(onBoardingList[position])
    }


    override fun getItemCount(): Int {
       return  onBoardingList.size
    }
}