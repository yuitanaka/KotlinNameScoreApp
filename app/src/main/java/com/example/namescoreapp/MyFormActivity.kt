package com.example.namescoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.my_form.*

class MyFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_form)
    }

    fun getScore(view: View){
        var editText = myEditText.getText().toString()
        if(editText.equals("")){
            //エラー処理
            myEditText.setError("Please enter your name!")
        } else {
            //次の画面へ
            val intent = Intent(this, MyResultActivity::class.java)
            intent.putExtra("MYNAME", editText)
            startActivity(intent)
        }
    }
}
