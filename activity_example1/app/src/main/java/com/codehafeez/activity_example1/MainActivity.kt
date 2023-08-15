package com.codehafeez.activity_example1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToActivity2(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun goToActivity3(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("params_value1", "CodeHafeez")
        startActivity(intent)
    }

    fun goToActivity4(view: View) {
        val intent = Intent(applicationContext, MainActivity4::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}