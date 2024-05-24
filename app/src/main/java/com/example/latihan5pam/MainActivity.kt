package com.example.latihan5pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.sqrt
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val a = 2.0
        val x = sqrt(a)
        Log.d("halo", x.toString())
        setContentView(R.layout.activity_main)
    }
}