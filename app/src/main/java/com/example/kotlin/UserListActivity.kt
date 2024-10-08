package com.example.kotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class UserListActivity : AppCompatActivity() {

    private lateinit var listViewUsers: ListView
    private val userList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_list)

    }

    private fun loadUsers() {

    }

}
