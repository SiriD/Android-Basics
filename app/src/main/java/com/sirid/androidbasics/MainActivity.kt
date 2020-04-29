package com.sirid.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "onCreate called")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "onStart called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "onPause called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "onResume called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart", "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "onDestroy called")
    }
}
