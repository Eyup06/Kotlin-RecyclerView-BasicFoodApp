package com.eyupyilmaz.kotlinbasicfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val food = intent.getParcelableExtra<FoodItem>("food")
        if (food != null)
        {
            val detailsText : TextView = findViewById(R.id.detailsFoodName)
            val detailsImage : ImageView = findViewById(R.id.detailsFoodIV)
            val detailsFoodExplain : TextView = findViewById(R.id.detailsFoodExplain)

            detailsText.text = food.foodName
            detailsImage.setImageResource(food.foodImage)
            detailsFoodExplain.text = food.foodExplain
        }
    }
}