package com.example.publikakun.cobakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.publikakun.cobakotlin.utils.Constant
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var getKey = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getKey = intent.getStringExtra(Constant.KEY)
        edt_name.setText(getKey)

    }
}
