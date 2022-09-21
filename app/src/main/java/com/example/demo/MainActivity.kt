package com.example.demo

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG,"on create")
        }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"on Destroy")
    }
    }




