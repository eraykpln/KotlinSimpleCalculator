package com.eraykaplan.calculators

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var temp1: Double? = null
    var temp2: Double? = null
    var res: Double? = null

    fun calculation( a:Int): String {
        var resString=""
        temp1=num1.text.toString().toDoubleOrNull()
        temp2=num2.text.toString().toDoubleOrNull()
        if( temp1!=null && temp2!=null)
        {
            when(a) // 0=summarize  1= substraction 2=multiplying 3= dividing
            {
                0 -> res= temp1!!+temp2!!
                1 -> res= temp1!!-temp2!!
                2 -> res= temp1!!*temp2!!
                3 -> res= temp1!!/temp2!!

            }
            resString="Result: $res"
        }else
        {
            resString="please enter variable"
        }
        return resString
    }
    fun Sum(view: View)
    {
       resultText.text= calculation(0)
    }
    fun Sub(view: View)
    {
        resultText.text= calculation(1)
    } fun Multiply(view: View)
    {
        resultText.text= calculation(2)
    } fun Div(view: View)
    {
        resultText.text= calculation(3)
    }
}