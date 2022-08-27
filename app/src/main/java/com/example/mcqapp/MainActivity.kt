package com.example.mcqapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ans = false

        val buttonA: Button = findViewById(R.id.button)
        val buttonB: Button = findViewById(R.id.button2)
        val buttonC: Button = findViewById(R.id.button3)
        val buttonD: Button = findViewById(R.id.button4)

        val buttonSubmit: Button = findViewById(R.id.button5)

        val selectAns: TextView = findViewById(R.id.textView3)

        buttonA.setOnClickListener{
            ans = false
            selectAns.text = "Selected option: A"
        }
        buttonB.setOnClickListener{
            ans = true
            selectAns.text = "Selected option: B"
        }
        buttonC.setOnClickListener{
            ans = false
            selectAns.text = "Selected option: C"
        }
        buttonD.setOnClickListener{
            ans = false
            selectAns.text = "Selected option: D"
        }
        buttonSubmit.setOnClickListener{
            if(ans){
                Toast.makeText(applicationContext, "Correct Answer!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Wrong Answer.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
//this is branch "master"