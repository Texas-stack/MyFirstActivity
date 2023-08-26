package com.example.myfirstactivity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton

class ShopActivity:AppCompatActivity() {

    companion object {
        const val STATE = "STATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(STATE, "Запуск экрана")

        setContentView(R.layout.shop_activity)

        val backButton = findViewById<ImageView>(R.id.backbutton)

//        val imageView = findViewById<ImageView>(R.id.imageView);
        val internetUrl = "https://is5-ssl.mzstatic.com/image/thumb/Music115/v4/7b/58/c2/7b58c21a-2b51-2bb2-e59a-9bb9b96ad8c3/00602567924166.rgb.jpg/100x100bb.jpg";

        Glide.with(this)
            .load(internetUrl)
//            .into(imageView)


        backButton.setOnClickListener(){
            Log.d(STATE, "Выход с экрана")
           finish()



        }



        var finalCost = 0
        val firstCost = findViewById<TextView>(R.id.firstCost)
        val secondCost = findViewById<TextView>(R.id.secondCost)
        val thirdCost = findViewById<TextView>(R.id.thirdCost)
        val buyButton = findViewById<Button>(R.id.buyButton)



        val firstItem = findViewById<MaterialButton>(R.id.firstItem)

        firstItem.setOnClickListener(){
            Toast.makeText(this, "Ебааа, ты купил конфета1", Toast.LENGTH_SHORT).show()

            finalCost += firstCost.text.substring(0..2).toInt()
            Log.d(STATE, "$finalCost")
        }

        val secondItem = findViewById<MaterialButton>(R.id.secondItem)

        secondItem.setOnClickListener(){
            Toast.makeText(this, "Ебааа, ты купил конфета2", Toast.LENGTH_SHORT).show()

            finalCost += secondCost.text.substring(0..2).toInt()
            Log.d(STATE, "$finalCost")

        }

        val thirdItem = findViewById<MaterialButton>(R.id.thirdItem)

        thirdItem.setOnClickListener(){
            Toast.makeText(this, "Ебааа, ты купил конфета3", Toast.LENGTH_SHORT).show()

            finalCost += thirdCost.text.substring(0..2).toInt()
            Log.d(STATE, "$finalCost")

        }

        var rubles:String



        buyButton.setOnClickListener(){


            Toast.makeText(this, "Ты должен ${rubblesCounting(finalCost)}", Toast.LENGTH_SHORT).show()
            finalCost = 0
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(STATE, "Экран уничтожен")
    }

    override fun onResume() {
        Log.d(STATE, "Возвращение на экран")
        super.onResume()
    }
    fun rubblesCounting(cash: Int): String {
        if (cash % 100 in 10..20) {
            return "$cash рублей"
        } else {
            when (cash % 10) {
                0 -> return "$cash рублей"
                1 -> return "$cash рубль"
                in 2..4 -> return "$cash рубля"
                in 5..9 -> return "$cash рублей"

            }
        }
        return ""
    }


}