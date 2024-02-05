package com.eyupyilmaz.kotlinbasicfoodapp

import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView

data class FoodItem(val foodImage:Int, val foodName:String, val foodExplain:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foodImage)
        parcel.writeString(foodName)
        parcel.writeString(foodExplain)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodItem> {
        override fun createFromParcel(parcel: Parcel): FoodItem {
            return FoodItem(parcel)
        }

        override fun newArray(size: Int): Array<FoodItem?> {
            return arrayOfNulls(size)
        }
    }
}
