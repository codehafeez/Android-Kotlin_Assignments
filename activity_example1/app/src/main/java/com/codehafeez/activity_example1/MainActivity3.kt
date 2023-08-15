package com.codehafeez.activity_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val v1 = intent.extras!!.getString("params_value1")
        val nameResult = findViewById<TextView>(R.id.textView1)
        nameResult.text = "Welcome ,$v1"
    }
}