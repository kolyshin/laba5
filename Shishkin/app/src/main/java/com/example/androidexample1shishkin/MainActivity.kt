package com.example.androidexample1shishkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(view: View){
        val clickSecAc = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(clickSecAc)
    }
}
