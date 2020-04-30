package com.sirid.androidbasics.intentsbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sirid.androidbasics.R

class NewIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_intent)
        Toast.makeText(this, R.string.someToast, Toast.LENGTH_LONG).show()
    }
}
