package com.ksappdev.bmicalculate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // emi =wt/ht*ht --> kg/m2


            btnResult.setOnClickListener {
                if(eTht.text.toString()!="" && eTwt.text.toString()!="" && eTin.text.toString()!="") {

            val wt = eTwt.text.toString().toInt()
            val ht = eTht.text.toString().toInt()
            val inch = eTin.text.toString().toInt()
            //1ft=12inches
            val totalInches = ht*12+inch
            //inches cm, 1m=100cm,1cm=1/100m
             val cm=totalInches * 2.54
            val m = cm/100
            val bmi=wt/(m*m)
            when{

                bmi>25-> {
                    tVResult.text="You are OverWeight"}
                bmi<18->{
                    tVResult.text="You are UnderWeight"
                }
                else->{
                    tVResult.text="You are Healthy"
                }
                }
                }
                else {
                    Toast.makeText(this, "Please fill the blanks", Toast.LENGTH_SHORT).show()
                }

        }


    }



}
