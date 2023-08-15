package com.codehafeez.snackbar_example1
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {

    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one = findViewById(R.id.button)
        two = findViewById(R.id.button2)
        three = findViewById(R.id.button3)

        one.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(R.id.idMainLayout), "www.codehafeez.com", Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        two.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(R.id.idMainLayout), "Message is deleted", Snackbar.LENGTH_LONG)
                .setAction("Undo") { view ->
                    val snackbar1 = Snackbar.make(findViewById(R.id.idMainLayout),"Click Undo", Snackbar.LENGTH_SHORT)
                    snackbar1.show()
                }
            snackbar.show()
        }

        three.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(R.id.idMainLayout), "Try again!", Snackbar.LENGTH_LONG).setAction("Retry") {
                val snackbar1 = Snackbar.make(findViewById(R.id.idMainLayout),"Retry Click", Snackbar.LENGTH_SHORT)
                snackbar1.show()
            }
            snackbar.setActionTextColor(Color.RED)
            val sbView: View = snackbar.view
            val textView = sbView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            textView.setTextColor(Color.YELLOW)
            snackbar.show()
        }
    }
}