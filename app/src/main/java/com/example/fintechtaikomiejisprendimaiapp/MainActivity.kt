package com.example.fintechtaikomiejisprendimaiapp

import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity
import java.util.Random


class MainActivity : ComponentActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var buttonChangeColor: Button
    val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        button = findViewById(R.id.button)
        buttonChangeColor = findViewById(R.id.button_change_color)

        var num = 1
        button.setOnClickListener {
            textView.text = num.toString()
            num += 1
        }

        buttonChangeColor.setOnClickListener {
            val red = random.nextInt(256)
            val green = random.nextInt(256)
            val blue = random.nextInt(256)
            textView.setTextColor(Color.argb(255, red, green, blue))
        }
    }
}