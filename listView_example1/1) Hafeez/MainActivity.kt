package com.codehafeez.listview_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
class MainActivity : AppCompatActivity() {

    private lateinit var listView1: ListView
    private lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView1 = findViewById<ListView>(R.id.listView1)
        val items = arrayOf("Item1", "Item2", "Item3", "Item4", "Item5")
        val itemsList = ArrayList<String>(items.asList())

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemsList)
        // arrayAdapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        arrayAdapter.add("Item6");
        arrayAdapter.add("Item7");
        arrayAdapter.add("Item8");
        listView1.adapter = arrayAdapter

        listView1.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val itemValue = arrayAdapter.getItem(position)
            Toast.makeText(applicationContext, itemValue, Toast.LENGTH_SHORT).show()
            // Toast.makeText(applicationContext, (view as TextView).text, Toast.LENGTH_SHORT).show()
        }
    }
}