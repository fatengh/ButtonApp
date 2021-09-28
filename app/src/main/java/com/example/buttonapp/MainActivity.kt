package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var positveBTN: Button
    private lateinit var nigativeBTN: Button
    private lateinit var tvNumber: TextView
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        positveBTN = findViewById(R.id.button2)
        nigativeBTN = findViewById(R.id.button3)
        tvNumber = findViewById(R.id.tvNum)
        positveBTN.setOnClickListener { positve() }
        nigativeBTN.setOnClickListener { nigative() }
    }

    fun positve(){
        num++
        if(num == 0){
            tvNumber.setTextColor(Color.parseColor("#000000"))
        }else{
        tvNumber.setTextColor(Color.parseColor("#00FF00"))
        tvNumber.text = num.toString()}
    }
    fun nigative(){
        num--
        if(num == 0){
            tvNumber.setTextColor(Color.parseColor("#000000"))
        }else{
        tvNumber.setTextColor(Color.parseColor("#ff0000"))
        tvNumber.text = num.toString()}

    }
}
