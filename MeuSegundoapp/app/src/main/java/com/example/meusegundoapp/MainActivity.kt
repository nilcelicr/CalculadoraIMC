package com.example.meusegundoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val altura : Float = 1.50f * 1.50f
        val peso : Int = 100

        val result = (peso/altura)
        println(result)

       val btncalcular: Button =  findViewById(R.id.btncalcular)

        btncalcular.setOnClickListener {
            val altura : Float = 1.50f * 1.50f
            val peso : Float = 100

            val result = (peso/altura)
            println(result) }

    }
}