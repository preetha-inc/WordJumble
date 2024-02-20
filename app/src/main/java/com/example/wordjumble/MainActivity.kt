package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.btnStart)
        val inputWord=findViewById<EditText>(R.id.etWord)
        val inputClue = findViewById<EditText>(R.id.etClue)
        startButton.setOnClickListener{
            val enteredWord = inputWord.text.toString()
            val enteredClue = inputClue.text.toString()
            if(enteredWord=="" || enteredClue==""){
                Toast.makeText(this@MainActivity, "Please fill in the input fields!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}