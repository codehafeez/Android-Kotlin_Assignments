package com.codehafeez.sharedpreferences_example1
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
class MainActivity2 : AppCompatActivity() {

    private var sharedPreferences: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun showDataFunction(v: View?) {
        sharedPreferences = applicationContext.getSharedPreferences("MySharedPreferences", 0)
        val uId = sharedPreferences?.getString("userId", null)
        val uName = sharedPreferences?.getString("username", null)
        Toast.makeText(applicationContext, "$uId - $uName", Toast.LENGTH_LONG).show()
    }

    fun clearDataFunction(v: View?) {
        sharedPreferences = applicationContext.getSharedPreferences("MySharedPreferences", 0)
        val editor = sharedPreferences?.edit()
        editor?.clear()?.commit()
        Toast.makeText(applicationContext, "Clear Data", Toast.LENGTH_LONG).show()
    }
}