package com.example.myfirstactivity

import android.annotation.SuppressLint
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

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(STATE, "Запуск экрана")

        setContentView(R.layout.shop_activity)

        val backButton = findViewById<ImageView>(R.id.backbutton)

        val imageView1 = findViewById<ImageView>(R.id.imageView1);
        val imageView2 = findViewById<ImageView>(R.id.imageView2);
        val imageView3 = findViewById<ImageView>(R.id.imageView3);
        val imageView4 = findViewById<ImageView>(R.id.imageView4);
        val imageView5 = findViewById<ImageView>(R.id.imageView5);
        val imageView6 = findViewById<ImageView>(R.id.imageView6);
        val imageView7 = findViewById<ImageView>(R.id.imageView7);
        val imageView8 = findViewById<ImageView>(R.id.imageView8);

        val internetUrl1 = "https://is5-ssl.mzstatic.com/image/thumb/Music115/v4/7b/58/c2/7b58c21a-2b51-2bb2-e59a-9bb9b96ad8c3/00602567924166.rgb.jpg/100x100bb.jpg";
        val internetUrl2 = "https://is5-ssl.mzstatic.com/image/thumb/Music115/v4/7b/58/c2/7b58c21a-2b51-2bb2-e59a-9bb9b96ad8c3/00602567924166.rgb.jpg/100x100bb.jpg";
        val internetUrl3 = "https://is3-ssl.mzstatic.com/image/thumb/Music114/v4/0d/3a/07/0d3a0762-c8d4-8bb4-aab6-8eee51059c82/mzi.wbhxtnxx.jpg/100x100bb.jpg";
        val internetUrl4 = "https://is5-ssl.mzstatic.com/image/thumb/Music115/v4/7b/58/c2/7b58c21a-2b51-2bb2-e59a-9bb9b96ad8c3/00602567924166.rgb.jpg/100x100bb.jpg";
        val internetUrl5 = "https://is3-ssl.mzstatic.com/image/thumb/Music115/v4/de/8a/27/de8a2743-c4f6-9932-5d66-337d7d3ee660/886444533638.jpg/100x100bb.jpg";
        val internetUrl6 = "https://is4-ssl.mzstatic.com/image/thumb/Music4/v4/a9/2f/ca/a92fcaa8-1025-0daa-b97d-19a185e743d5/cover.jpg/100x100bb.jpg";
        val internetUrl7 = "https://is4-ssl.mzstatic.com/image/thumb/Music126/v4/8d/f7/94/8df7941f-b089-7d97-1348-7b55f026aed6/d5ad91de-de10-4ee6-89a1-340d6c775443.jpg/100x100bb.jpg";
        val internetUrl8 = "https://is2-ssl.mzstatic.com/image/thumb/Music114/v4/48/ef/06/48ef06c3-29e5-dc3a-2db9-7551db464b71/859706864559_cover.jpg/100x100bb.jpg";


        Glide.with(this)
            .load(internetUrl1)
            .into(imageView1)

        Glide.with(this)
            .load(internetUrl2)
            .into(imageView2)

        Glide.with(this)
            .load(internetUrl3)
            .into(imageView3)

        Glide.with(this)
            .load(internetUrl4)
            .into(imageView4)

        Glide.with(this)
            .load(internetUrl5)
            .into(imageView5)

        Glide.with(this)
            .load(internetUrl6)
            .into(imageView6)

        Glide.with(this)
            .load(internetUrl7)
            .into(imageView7)

        Glide.with(this)
            .load(internetUrl8)
            .into(imageView8)





        backButton.setOnClickListener() {
            Log.d(STATE, "Выход с экрана")
            finish()


        }


    }
}