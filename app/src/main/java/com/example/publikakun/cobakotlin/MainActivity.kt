package com.example.publikakun.cobakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.publikakun.cobakotlin.utils.Constant
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = enterNameEdt.text
        showNameButton.setOnClickListener {
            if (text.isEmpty()) resultTxt.text="Enter name" else resultTxt.text="Welcome $text"

        }
        btn_intent.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java).apply {
                putExtra(Constant.KEY,"KEY")
            })
        }
    }
}
