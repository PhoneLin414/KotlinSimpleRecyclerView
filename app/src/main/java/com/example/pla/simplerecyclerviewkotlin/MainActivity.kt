package com.example.pla.simplerecyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter: Adapter? = null

    val userList: ArrayList<Users> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createUserList()

        adapter = Adapter(userList, this)

        rv_user.layoutManager = LinearLayoutManager(this)
        rv_user.adapter = adapter

    }


    fun createUserList() {


        var user1 = Users("PLA", "123")
        var user2 = Users("KKK", "456")
        var user3 = Users("MSA", "789")


        userList.add(user1)
        userList.add(user2)
        userList.add(user3)

    }

}
