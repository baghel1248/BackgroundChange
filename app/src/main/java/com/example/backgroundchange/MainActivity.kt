package com.example.backgroundchange

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button
        val button2: Button
        val relativeLayout: RelativeLayout

        // set button 1 with its id
        button1 = findViewById(R.id.btVar1)

        // set button 2 with its id
        button2 = findViewById(R.id.btVar2)

        // set relative layout with its id
        relativeLayout = findViewById(R.id.rlVar1)

        // onClick function for button 1
        button1.setOnClickListener { // set the color to relative layout
            relativeLayout.setBackgroundResource(R.color.cool)
        }

        // onClick function for button 2
        button2.setOnClickListener { // set the color to relative layout
            relativeLayout.setBackgroundResource(R.color.warm)
        }
    }
}
