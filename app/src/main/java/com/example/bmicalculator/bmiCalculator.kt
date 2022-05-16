package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class bmiCalculator : AppCompatActivity() {
    lateinit var btnPlus: Button
    lateinit var btnMinus: Button
    lateinit var btnModulus: Button
    lateinit var btnMultiply: Button
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        btnPlus= findViewById(R.id.btnPlus)
        btnMinus= findViewById(R.id.btnMinus)
        btnModulus= findViewById(R.id.btnModulus)
        btnMultiply= findViewById(R.id.btnMultiply)
        etFirstNumber= findViewById(R.id.etFirstNumber)
        etSecondNumber= findViewById(R.id.etSecondNumber)
        tvResult= findViewById(R.id.tvResult)

        btnPlus.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            addition(number1,number2)

        }
        btnMinus.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            subtraction(number1,number2)

        }
        btnMultiply.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            multiplication(number1,number2)

        }
        btnModulus.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString().toDouble()
            val number2 = etSecondNumber.text.toString().toDouble()
            modulus(number1,number2)
        }
    }

    fun addition(number1:Double, number2: Double){
        val add = number1+number2
        tvResult.text = add.toString()
    }
    fun subtraction(number1: Double, number2: Double){
        val subtract = number1-number2
        tvResult.text = subtract.toString()
    }
    fun multiplication(number1: Double, number2: Double){
        val multiply = number1*number2
        tvResult.text = multiply.toString()
    }
    fun modulus(number1: Double, number2: Double){
        val remainder = number1%number2
        tvResult.text = remainder.toString()
    }

    }
}