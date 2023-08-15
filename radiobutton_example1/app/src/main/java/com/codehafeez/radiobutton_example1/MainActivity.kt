package com.codehafeez.radiobutton_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funCheckValues(view: View)
    {
        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        val selectedValueLabel = findViewById<TextView>(R.id.checkBoxSelected)
        val selectedRadioButton: RadioButton = findViewById(radioGroup1.checkedRadioButtonId)
        selectedValueLabel.text = "Selected value : ${selectedRadioButton.text}"
    }
}