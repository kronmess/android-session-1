package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var  numberOneEditText: EditText
    lateinit var  numberTwoEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOneEditText = findViewById(R.id.numberOneEditText)
        numberTwoEditText = findViewById(R.id.numberTwoEditText)
    }
    fun calculateValue(view: View){
        val numberOne : Int? = numberOneEditText.text.toString().toIntOrNull()
        val numberTwo : Int? = numberTwoEditText.text.toString().toIntOrNull()

        if (numberOne == null || numberTwo == null){
            Toast.makeText(this,"Both numbers should be integers",Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(this,"The result is ${numberOne + numberTwo}",Toast.LENGTH_SHORT).show()
    }
}