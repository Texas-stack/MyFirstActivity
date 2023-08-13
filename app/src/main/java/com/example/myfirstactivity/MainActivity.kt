package com.example.myfirstactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shopButton = findViewById<Button>(R.id.shopButton)

        shopButton.setOnClickListener(){
            val shopIntent = Intent(this, ShopActivity::class.java)
            startActivity(shopIntent)


        }

        val itemsListButton = findViewById<Button>(R.id.itemsList)

        itemsListButton.setOnClickListener(){
            val goodsListIntent = Intent(this, GoodsListActivity::class.java)
            startActivity(goodsListIntent)
        }
    }
}