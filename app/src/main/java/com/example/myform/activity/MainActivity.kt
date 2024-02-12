package com.example.myform.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myform.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("my-app", "onCreate")
//        val num1 = calculate.add(1, 2)
//        Log.d("my-app", "1 + 2 = $num1")
//        Log.d("my-app", "1 - 2 = ${calculate.sub(1, 2)}")
//        Log.d("my-app", "1 * 2 = ${calculate.mul(1, 2)}")
//        Log.d("my-app", "1 / 2 = ${calculate.div(1, 2)}")
    }
}