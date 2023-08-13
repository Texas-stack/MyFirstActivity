package com.example.myfirstactivity.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstactivity.R
import com.example.myfirstactivity.model.UserModel


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


}


class Adapter() : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    private var userList = emptyList<UserModel>()


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.someText).text = userList[position].someNumber
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>){
        userList = list
        notifyDataSetChanged()
    }

}