package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button=findViewById(R.id.button)
        roll.setOnClickListener(View.OnClickListener {
           rolldice()
        })
    }

    private fun rolldice() {
        val r=Dice(6)
        val r1=r.roll()
        val t:TextView=findViewById(R.id.textView)
        t.text=r1.toString()
        val i:ImageView=findViewById(R.id.imageView)
        var d=when(r1){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        i.setImageResource(d)
    }
}
