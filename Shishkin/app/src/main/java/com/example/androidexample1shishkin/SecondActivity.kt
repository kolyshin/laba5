package com.example.androidexample1shishkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun onClick(view: View){
        val clickSecAc = Intent(this@SecondActivity, MainActivity::class.java)
        startActivity(clickSecAc)
         }
    fun onClick2(view: View)
    {
        val one= 210
        val two= 195
        var summ = two - one
        System.out.println(summ)
        val textView:TextView= findViewById(R.id.textviews)
        textView.text = summ.toString()
    }

}
