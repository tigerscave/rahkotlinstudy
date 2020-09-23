package com.example.hellowolrd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_first.*
import android.widget.Button;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

//        btn.setOnClickListener{
//            //testText.text = "hogeeee"
//            // startActivity(Intent(this,  Product::class.java))
//            //Log.d("hogeeeee", "test")
//        }
    }
}