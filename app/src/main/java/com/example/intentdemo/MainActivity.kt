package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var explicitBtn: Button
    lateinit var implicitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        explicitBtn = findViewById<View> (R.id.ext) as Button
        implicitBtn = findViewById<View> (R.id.imp) as Button

        explicitBtn.setOnClickListener { val intent = Intent(baseContext , SecondActivity::class.java)
        startActivity(intent)
        }
        implicitBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.starcertification.org")
        startActivity(intent)
    }
}


}
