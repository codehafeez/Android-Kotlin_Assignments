package com.codehafeez.sharedpreferences_example1
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class MainActivity : AppCompatActivity() {

    private var sharedPreferences: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saveDataFunction(v: View?) {
        sharedPreferences = applicationContext.getSharedPreferences("MySharedPreferences", 0)
        val editor = sharedPreferences!!.edit()
        editor.putString("userId", "user1")
        editor.putString("username", "Hafeez")
        editor.commit()

        val intent = Intent(this, MainActivity2::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}