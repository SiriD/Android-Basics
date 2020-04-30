package com.sirid.androidbasics.intentsbasics

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sirid.androidbasics.R

class IntentsBasicsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents_basics)
        val buttonExplicit = findViewById<Button>(R.id.buttonExplicit)
        val buttonImplicit = findViewById<Button>(R.id.buttonImplicit)

        // explicit intent
        buttonExplicit.setOnClickListener {
            val intent = Intent(this, NewIntentActivity::class.java)
            startActivity(intent) }

        // implicit intent
        buttonImplicit.setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(webIntent)
        }


    }
}
