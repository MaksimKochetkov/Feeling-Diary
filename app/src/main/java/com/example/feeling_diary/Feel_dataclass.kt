package com.example.feeling_diary

data class Feel(val imageId:Int, val title:String)
class Feel_list{val list = arrayListOf(
    Feel(R.drawable.icon, "Спокойным"),
    Feel(R.drawable.icon1, "Расслабленным"),
    Feel(R.drawable.icon2, "Задумчивым"),
    Feel(R.drawable.icon3, "Взволнованным"),
    Feel(R.drawable.icon4, "Крутым"),
    Feel(R.drawable.icon5, "Осенним"),
    Feel(R.drawable.icon6, "Весенним")
)
}
