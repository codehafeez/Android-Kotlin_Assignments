package com.codehafeez.font_example1
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.textView1)
        val tv2 = findViewById<TextView>(R.id.textView2)
        val tv3 = findViewById<TextView>(R.id.textView3)
        val tv4 = findViewById<TextView>(R.id.textView4)

        val face1 = Typeface.createFromAsset(assets, "fonts/FreeScpt.ttf")
        tv1.setTypeface(face1)

        val face2 = Typeface.createFromAsset(assets, "fonts/FreestyleScriptPlain.ttf")
        tv2.typeface = face2

        val face3 = Typeface.createFromAsset(assets, "fonts/Alegreya-Italic.ttf")
        tv3.typeface = face3

        val face4 = Typeface.createFromAsset(assets, "fonts/Alegreya-Regular.ttf")
        tv4.typeface = face4
    }
}