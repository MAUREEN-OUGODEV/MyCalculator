package com.techmania.calculator

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
  lateinit var  tilFirstNumber:TextInputLayout
  lateinit var etFirstNumber:TextInputEditText
  lateinit var tilSecondNumber:TextInputLayout
  lateinit var etSecondNumber: TextInputEditText
  lateinit var btnAddition : Button
  lateinit var btnSub:Button
  lateinit var btnMultiply:Button
  lateinit var btnDivide:Button
  lateinit var tvAnswer:TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      castviews()
    }

    override fun onResume() {
        super.onResume()
      btnAddition.setOnClickListener {

      addition()
        validation()
      }
      btnDivide.setOnClickListener {

        modulous()
        validation()
      }
      btnMultiply.setOnClickListener {
        multiply()
        validation()

      }
      btnSub.setOnClickListener {

        subtraction()
        validation()
      }


    }
  fun castviews(){
    tilFirstNumber=findViewById(R.id.tilFirstNumber)
    etFirstNumber= findViewById(R.id.etfirstNumber)
    tilSecondNumber=findViewById(R.id.tilSecondNumber)
    etSecondNumber= findViewById(R.id.etSecondNumber)
    btnAddition=findViewById(R.id.buttonAddition)
    btnSub=findViewById(R.id.buttonSub)
    btnMultiply = findViewById(R.id.buttonMultiply)
    btnDivide=findViewById(R.id.buttonDivide)

    tvAnswer =findViewById(R.id.tvAnswer)





  }
fun validation(){
  val firstNumber=etFirstNumber.text.toString()
  val secondNumber = etSecondNumber.text.toString()
  var error =false
  

  if(firstNumber.isBlank()){
    tilFirstNumber.error = "First name required"
    error = true
    firstNumber.toDouble()
  }


  if(secondNumber.isBlank()){
    tilSecondNumber.error="Last name requred"
    error = true
    secondNumber.toDouble()
  }

}

fun addition(){
  val firstNumber=etFirstNumber.text.toString().toDouble()
  val secondNumber = etSecondNumber.text.toString().toDouble()
  val answer=firstNumber +secondNumber
  tvAnswer.text=answer.toString()
}

fun subtraction(){
  val firstNumber=etFirstNumber.text.toString().toDouble()
  val secondNumber = etSecondNumber.text.toString().toDouble()
  val answer=firstNumber -secondNumber
  tvAnswer.text=answer.toString()
}
  fun modulous (){
    val firstNumber=etFirstNumber.text.toString().toDouble()
    val secondNumber = etSecondNumber.text.toString().toDouble()
    val answer=firstNumber %secondNumber
    tvAnswer.text=answer.toString()

  }
fun multiply(){
  val firstNumber=etFirstNumber.text.toString().toDouble()
  val secondNumber = etSecondNumber.text.toString().toDouble()
  val answer=firstNumber * secondNumber
  tvAnswer.text=answer.toString()

}

}





