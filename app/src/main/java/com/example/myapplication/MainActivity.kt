package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_1)
// get reference to button
        val btn_click_me = findViewById(R.id.exit_button_calender) as Button
// set on-click listener
        btn_click_me.setOnClickListener {

        }
    }
}