package com.codehafeez.toast_example3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun simpleToastFunction(view: View) {
        Toast.makeText(applicationContext, "Simple Toast", Toast.LENGTH_SHORT).show();
    }

    fun imageToastFunction(view: View) {
        val layoutInflater = LayoutInflater.from(this)
        val viewLayout = layoutInflater.inflate(R.layout.toast_image_layout, findViewById<ViewGroup>(R.id.toast_dialog_layoutId))

        val toastEx = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
        // toastEx.setGravity(Gravity.BOTTOM, 0, 0)
        toastEx.view = viewLayout
        toastEx.show()
    }
}