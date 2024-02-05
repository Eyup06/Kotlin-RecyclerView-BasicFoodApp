package com.eyupyilmaz.kotlinbasicfoodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList:ArrayList<FoodItem>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    var onItemClick : ((FoodItem) -> Unit)? = null

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val foodIV : ImageView = itemView.findViewById(R.id.foodIV)
        val foodName : TextView = itemView.findViewById(R.id.foodName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.foodIV.setImageResource(food.foodImage)
        holder.foodName.text = food.foodName

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(food)
        }
    }
}