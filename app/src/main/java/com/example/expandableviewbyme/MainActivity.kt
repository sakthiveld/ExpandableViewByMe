package com.example.expandableviewbyme

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.financial_trend_score_inner_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card : ExpandableCardView = findViewById(R.id.financial_trend_score)

        card.setOnExpandedListener { view, isExpanded ->
            if(isExpanded){
                first.setText("first")
                second.setText("second")
            }
            else
            Toast.makeText(this, "collapsed", Toast.LENGTH_LONG)
        }


    }
}
