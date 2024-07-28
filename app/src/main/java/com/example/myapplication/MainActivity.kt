package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var buttonCalculate: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewResult = findViewById(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            calculateAndDisplayResult()
        }
    }
    private fun calculateAndDisplayResult() {
        val num1String = editTextNumber1.text.toString()
        val num2String = editTextNumber2.text.toString()

        if (num1String.isBlank() || num2String.isBlank()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = num1String.toDouble()
        val num2 = num2String.toDouble()
        val result = num1 + num2 // Perform addition

        textViewResult.text = "Result: $result"
        Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
    }
}