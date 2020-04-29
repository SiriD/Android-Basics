package com.sirid.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sirid.androidbasics.intentsbasics.IntentsBasicsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bLifecycle = findViewById<Button>(R.id.bLifecycle)
        bLifecycle.setOnClickListener {
            startActivity(Intent(this, LifecycleBasicsActivity::class.java))
        }

        val bIntents = findViewById<Button>(R.id.bIntents)
        bIntents.setOnClickListener {
            startActivity(Intent(this, IntentsBasicsActivity::class.java))
        }
    }
}
