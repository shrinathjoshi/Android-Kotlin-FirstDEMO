package com.example.shrinath.dinnerorder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList= arrayListOf("Burger","Pizza","Dosa","Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    selectedFoodText.text ="Burger King"

        btnDecide.setOnClickListener{
            println("Decide Pressed")

            var random =Random()
            var randomfood=random.nextInt(foodList.count())
            selectedFoodText.text=foodList[randomfood]
        }
        btnAdd.setOnClickListener{

            print("Clicked Add")

            var add=etAddFood.text.toString();
            foodList.add(add);
            etAddFood.text.clear()
            println(foodList)
        }

    }
}
