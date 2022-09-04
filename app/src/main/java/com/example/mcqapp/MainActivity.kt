package com.example.mcqapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.button2.setOnClickListener()

        val Question: ImageView = findViewById(R.id.imageView)
        Question.setImageResource(R.drawable.fiftytwo)

        var ans = false

        val buttonA: Button = findViewById(R.id.button)
        val buttonB: Button = findViewById(R.id.button2)
        val buttonC: Button = findViewById(R.id.button3)
        val buttonD: Button = findViewById(R.id.button4)

        val buttonSubmit: Button = findViewById(R.id.button5)

        val selectAns: TextView = findViewById(R.id.textView3)

        val CorrectAns = getString(R.string.correct_ans)
        val WrongAns = getString(R.string.wrong_ans)

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
                Snackbar.make(
                    findViewById(R.id.constraint_Layout),
                    CorrectAns,
                    Snackbar.LENGTH_SHORT
                ).show()
            }else{
                Snackbar.make(
                    findViewById(R.id.constraint_Layout),
                    WrongAns,
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }
}
//this is "resources" branch