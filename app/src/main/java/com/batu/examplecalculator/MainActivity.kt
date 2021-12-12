package com.batu.examplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1: Int? = null
    var num2:Int? = null
    var result:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view: View){

         num1 = editTextNumber.text.toString().toIntOrNull()
         num2 = editTextNumber2.text.toString().toIntOrNull()

        if (num1==null || num2==null){
            resultText.text = "Error!"
        }else{
             result = num1!! + num2!!
            resultText.text = "Result : $result";
        }

    }

    fun mySub(view: View){
        num1 = editTextNumber.text.toString().toIntOrNull()
        num2 = editTextNumber2.text.toString().toIntOrNull()

        if (num1==null || num2==null){
            resultText.text = "Error!"
        }else{
            result = num1!! - num2!!
            resultText.text = "Result : $result";
        }
    }

    fun myMultiply(view: View){
        num1 = editTextNumber.text.toString().toIntOrNull()
        num2 = editTextNumber2.text.toString().toIntOrNull()

        if (num1==null || num2==null){
            resultText.text = "Error!"
        }else{
            result = num1!! * num2!!
            resultText.text = "Result : $result";
        }
    }

    fun myDiv(view: View){
        num1 = editTextNumber.text.toString().toIntOrNull()
        num2 = editTextNumber2.text.toString().toIntOrNull()

        if (num1==null || num2==null){
            resultText.text = "Error!"
        }else{
            if(num2==0){
                resultText.text= "The first number is not divisible by 0!!"
            }
            else{
                result = num1!! / num2!!
                resultText.text = "Result : $result";
            }
            }
    }
}