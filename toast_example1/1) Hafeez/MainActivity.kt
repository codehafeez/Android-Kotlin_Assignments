package com.codehafeez.toast_example
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun simpleToastFunction(view: View) {
        Toast.makeText(applicationContext, "Simple Toast", Toast.LENGTH_SHORT).show();
    }

    fun toastCenterFunction(view: View) {
        val toastEx = Toast.makeText(applicationContext, "Center Toast", Toast.LENGTH_SHORT)
        toastEx.setGravity(Gravity.CENTER,0,0);
        toastEx.show();
    }

    fun toastTopFunction(view: View) {
        val toastEx = Toast.makeText(applicationContext, "Top Toast", Toast.LENGTH_SHORT)
        toastEx.setGravity(Gravity.TOP,0,0);
        toastEx.show();
    }

    fun toastBottomFunction(view: View) {
        val toastEx = Toast.makeText(applicationContext, "Bottom Toast", Toast.LENGTH_SHORT)
        toastEx.setGravity(Gravity.BOTTOM,0,0);
        toastEx.show();
    }

    fun toastLeftFunction(view: View) {
        val toastEx = Toast.makeText(applicationContext, "Left Toast", Toast.LENGTH_SHORT)
        toastEx.setGravity(Gravity.LEFT,0,0);
        toastEx.show();
    }

    fun toastRightFunction(view: View) {
        val toastEx = Toast.makeText(applicationContext, "Right Toast", Toast.LENGTH_SHORT)
        toastEx.setGravity(Gravity.RIGHT,0,0);
        toastEx.show();
    }
}