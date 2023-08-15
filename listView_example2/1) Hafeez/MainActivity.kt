package com.codehafeez.listview_example2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {

    private lateinit var listView1: ListView
    private lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView1 = findViewById<ListView>(R.id.listView1)
        arrayAdapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        arrayAdapter.add("Item1");
        arrayAdapter.add("Item2");
        arrayAdapter.add("Item3");
        arrayAdapter.add("Item4");
        arrayAdapter.add("Item5");
        listView1.adapter = arrayAdapter

        listView1.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val itemToUpdate = arrayAdapter.getItem(position)
            arrayAdapter.remove(itemToUpdate)

            val updatedItem = "Updated Item$position"
            arrayAdapter.insert(updatedItem, position)

            arrayAdapter.notifyDataSetChanged()
        }
    }

    fun addItemListFunction(view: View) {
        val size = arrayAdapter.count+1
        arrayAdapter.add("Item$size");
        arrayAdapter.notifyDataSetChanged()
    }
}