package com.codehafeez.toast_example2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topToastBtn = findViewById<Button>(R.id.topToastBtn)
        topToastBtn.setOnClickListener {
            showToast("Top Toast", Gravity.TOP)
        }

        val bottomToastBtn = findViewById<Button>(R.id.bottomToastBtn)
        bottomToastBtn.setOnClickListener {
            showToast("Bottom Toast", Gravity.BOTTOM)
        }

        val centerToastBtn = findViewById<Button>(R.id.centerToastBtn)
        centerToastBtn.setOnClickListener {
            showToast("Center Toast", Gravity.CENTER)
        }
    }

    private fun showToast(message: String, gravity: Int) {
        val toastEx = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
        toastEx.setGravity(gravity,0,0);
        toastEx.show();
    }
}