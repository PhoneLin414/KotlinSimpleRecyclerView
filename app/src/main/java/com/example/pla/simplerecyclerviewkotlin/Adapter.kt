package com.example.pla.simplerecyclerviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.userlist_itemview.view.*

class Adapter(var userList: List<Users>, var context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.userlist_itemview, viewGroup, false))

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tv_username.text = userList[position].name
        holder.tv_phoneNo.text = userList[position].phoneNo

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_username = itemView.txt_name
        var tv_phoneNo = itemView.txt_phoneNo

    }

}