package com.codehafeez.checkbox_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funCheckValues(view: View)
    {
        val mylist = ArrayList<String>()
        val cb1 = findViewById<CheckBox>(R.id.checkBox1)
        val cb2 = findViewById<CheckBox>(R.id.checkBox2)
        val cb3 = findViewById<CheckBox>(R.id.checkBox3)


        if (cb1.isChecked) { mylist.add("Checkbox - 01") }
        if (cb2.isChecked) { mylist.add("Checkbox - 02") }
        if (cb3.isChecked) { mylist.add("Checkbox - 03") }


        val textView1 = findViewById<TextView>(R.id.checkBoxSelected_label1)
        textView1.text = "Selected Items : $mylist"


        val textView2 = findViewById<TextView>(R.id.checkBoxSelected_label2)
        if (mylist.size > 0)
        {
            var listValues = ""
            for (i in 0 until mylist.size) {
                listValues += "${mylist[i]}\n"
            }
            textView2.text = listValues
        }
        else {
            textView2.text = "No one selected...."
        }
    }
}