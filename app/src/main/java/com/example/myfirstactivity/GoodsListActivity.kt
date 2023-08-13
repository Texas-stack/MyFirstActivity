package com.example.myfirstactivity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Adapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstactivity.databinding.ActivityMainBinding
import com.example.myfirstactivity.databinding.GoodsListActivityBinding
import com.example.myfirstactivity.model.UserModel
import kotlin.random.Random

class GoodsListActivity: AppCompatActivity() {
    companion object {
        const val STATE = "STATE"
    }
    lateinit var binding: GoodsListActivityBinding

    lateinit var adapter: com.example.myfirstactivity.adapter.Adapter

    lateinit var recyclerView: RecyclerView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GoodsListActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val backButtonGoodsList = findViewById<Button>(R.id.backFromList)

        backButtonGoodsList.setOnClickListener(){
            Log.d(STATE, "Уничтожение листа")
            finish()
        }

        val listItemRecycler = findViewById<RecyclerView>(R.id.listRecyclerView)

        initial()
    }

    private fun initial() {
        recyclerView = binding.listRecyclerView
        adapter = com.example.myfirstactivity.adapter.Adapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())


    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()


        repeat(100){
            val user = UserModel("${Random.nextInt(0, 1000)}")
            userList.add(user)
        }



        return userList
    }
}