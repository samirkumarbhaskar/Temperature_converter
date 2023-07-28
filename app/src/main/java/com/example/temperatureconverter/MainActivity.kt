package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ele = findViewById<EditText>(R.id.editTextNumber2)
        var btn1 = findViewById<Button>(R.id.button3)
        var btn2 = findViewById<Button>(R.id.button4)
        btn1.setOnClickListener{
            var p = ele.text.toString().toDouble()
            var k = ((p-32)*5)/9
            ele.setText(String.format("%.2f",k))
        }

        btn2.setOnClickListener{
            var p1 = ele.text.toString().toDouble()
            var k1 = (1.8*p1)+32
            ele.setText(String.format("%.2f",k1))
        }
    }
}