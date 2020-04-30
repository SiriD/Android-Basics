package com.sirid.androidbasics.fragmentsbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import com.sirid.androidbasics.R

class FragmentBasicsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_basics_activity)

        val bFirstFragment = findViewById<Button>(R.id.bFragment1)
        bFirstFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame, FirstFragment.newInstance()).commit()
        }

        val bSecondFragment = findViewById<Button>(R.id.bFragment2)
        bSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame, SecondFragment.newInstance()).commit()
        }
    }

}
