package com.example.basiccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    private lateinit var num1:EditText
    private lateinit var num2:EditText
    private lateinit var addition:Button
    private lateinit var substraction:Button
    private lateinit var multiplication:Button
    private lateinit var division:Button
    private lateinit var answer:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1=findViewById(R.id.etNo1)
        num2=findViewById(R.id.etNo2)
        addition=findViewById(R.id.add)
        substraction=findViewById(R.id.sub)
        multiplication=findViewById(R.id.mul)
        division=findViewById(R.id.div)
        answer=findViewById(R.id.tvRes)

        addition.setOnClickListener{
            val finalNum1=num1.text.toString().toFloat()
            val finalNum2=num2.text.toString().toFloat()

            if (finalNum1 != null && finalNum2 != null) {
                val result = finalNum1 + finalNum2
                answer.text = "Addition is $result"
            } else {
                answer.text = "Invalid input"
            }
        }
        substraction.setOnClickListener{
            val finalNum1=num1.text.toString().toFloat()
            val finalNum2=num2.text.toString().toFloat()

            if (finalNum1 != null && finalNum2 != null) {
                val result = abs(finalNum1 - finalNum2)
                answer.text = "Substraction is $result"
            } else {
                answer.text = "Invalid input"
            }
            val ans=abs(finalNum1 - finalNum2)
            answer.text="Substraction is $ans"
        }
        multiplication.setOnClickListener{
            val finalNum1=num1.text.toString().toFloat()
            val finalNum2=num2.text.toString().toFloat()
            if (finalNum1 != null && finalNum2 != null) {
                val result = finalNum1 * finalNum2
                answer.text = "Multiplication is $result"
            } else {
                answer.text = "Invalid input"
            }
        }
        division.setOnClickListener{
            val finalNum1=num1.text.toString().toFloat()
            val finalNum2=num2.text.toString().toFloat()
            try{
                val result = finalNum1 / finalNum2
                answer.text = "Division is $result"
            }catch (e:Exception){
                answer.text="Cannot Divide by 0"
            }
        }

    }
}