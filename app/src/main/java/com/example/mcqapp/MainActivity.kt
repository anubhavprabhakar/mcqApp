package com.example.mcqapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA: Button = findViewById(R.id.button)
        val buttonB: Button = findViewById(R.id.button2)
        val buttonC: Button = findViewById(R.id.button3)
        val buttonD: Button = findViewById(R.id.button4)
        val buttonReset: Button = findViewById(R.id.button5)

        val answerdisplay: TextView = findViewById(R.id.textView3)

        buttonA.setOnClickListener{
            answerdisplay.text = "Your answer: A\nWrong answer. Please try again."
        }
        buttonB.setOnClickListener{
            answerdisplay.text = "Your answer: B\nCongrajulashons, correct answer!"
        }
        buttonC.setOnClickListener{
            answerdisplay.text = "Your answer: C\nWrong answer. Please try again."
        }
        buttonD.setOnClickListener{
            answerdisplay.text = "Your answer: D\nWrong answer. Please try again."
        }
        buttonReset.setOnClickListener{
            answerdisplay.text = ""
        }
    }
}