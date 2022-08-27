package com.example.mcqapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mcqapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.button2.setOnClickListener()

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
        binding.button2.setOnClickListener{
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
//this is "resources" branch