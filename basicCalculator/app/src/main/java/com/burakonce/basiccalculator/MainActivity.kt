package com.burakonce.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun plus(view: View){
        val result = editTextNumber.text.toString().toInt() + editTextNumber2.text.toString().toInt()
        textView.text = "Result: ${result}"
    }
    fun minus(view: View){
        val result = editTextNumber.text.toString().toInt() - editTextNumber2.text.toString().toInt()
        textView.text = "Result: ${result}"
    }
    fun multiply(view: View){
        val result = editTextNumber.text.toString().toDouble() * editTextNumber2.text.toString().toDouble()
        textView.text = "Result: ${result}"
    }
    fun divide(view: View){
        if(editTextNumber2.text.toString().toInt()==0){
            textView.text = "Please change number two. It cant 0"
        }
        else if(editTextNumber2.text.toString().toDouble()>editTextNumber.text.toString().toDouble()){
            textView.text = "Under 1"
        }
        else{
        val result = editTextNumber.text.toString().toDouble() / editTextNumber2.text.toString().toDouble()
        textView.text = "Result: ${result}"
        }
    }
}