package com.example.mcqapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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

        buttonA.setOnClickListener{
            //answerdisplay.text = "Your answer: A\nWrong answer. Please try again."
            Toast.makeText(getApplicationContext(),
                "Your answer: A\n" +
                        "Wrong answer. Please try again.",
                Toast.LENGTH_SHORT).show()
        }
        buttonB.setOnClickListener{
            //answerdisplay.text = "Your answer: B\nCongrajulashons, correct answer!"
            Toast.makeText(getApplicationContext(),
                "Your answer: B\n" +
                        "Congrajulashons, correct answer!",
                Toast.LENGTH_SHORT).show()
        }
        buttonC.setOnClickListener{
            //answerdisplay.text = "Your answer: C\nWrong answer. Please try again."
            Toast.makeText(getApplicationContext(),
                "Your answer: C\n" +
                        "Wrong answer. Please try again.",
                Toast.LENGTH_SHORT).show()
        }
        buttonD.setOnClickListener{
            //answerdisplay.text = "Your answer: D\nWrong answer. Please try again."
            Toast.makeText(getApplicationContext(),
                "Your answer: D\n" +
                        "Wrong answer. Please try again.",
                Toast.LENGTH_SHORT).show()
        }

    }
}