package com.example.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.jetpacknavigation.R

class MainActivity : AppCompatActivity() {
    var controller : NavController ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = findNavController(R.id.controller)

    }
}