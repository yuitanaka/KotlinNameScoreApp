package com.example.namescoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_result.*
import kotlin.random.Random

class MyResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_result)

        val myName = intent.getStringExtra("MYNAME")
        nameLabel.setText("${myName} の点数は...")

        var random = Random.nextInt(100)
        scoreLabel.setText("${random}点でした！")
    }
}
