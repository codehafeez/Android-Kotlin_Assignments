package com.codehafeez.listview_example3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    lateinit var listView1: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView1 = findViewById(R.id.listView1)
        arrayList.add(MyData("Hafeez", "2342343242"))
        arrayList.add(MyData("Azhar", "322532345"))
        arrayList.add(MyData("Noman", "3423433"))
        adapter = MyAdapter(this, arrayList)
        listView1.adapter = adapter
    }

    fun addItemFunction(view: View) {
        arrayList.add(MyData("New Item", "234234334"))
        adapter?.notifyDataSetChanged()
    }
}
