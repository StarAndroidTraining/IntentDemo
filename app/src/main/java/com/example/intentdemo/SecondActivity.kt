package com.example.intentdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedlnstanceState: Bundle?) {
        super.onCreate(savedlnstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(applicationContext, "We have switched to second Activity", Toast.LENGTH_LONG)
            .show()
    }

}