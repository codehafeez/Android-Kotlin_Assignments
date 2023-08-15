package com.codehafeez.toast_example4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
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
        val inflater = LayoutInflater.from(this)
        val layout = inflater.inflate(R.layout.toast_image_layout, null)

        val toastImage = layout.findViewById<ImageView>(R.id.toast_image)
        toastImage.setImageResource(R.drawable.web2)

        val toastText = layout.findViewById<TextView>(R.id.toast_text)
        toastText.text = "My Toast Message"

        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()
    }

}