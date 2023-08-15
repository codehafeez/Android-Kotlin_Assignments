package com.codehafeez.listview_example3
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
class MyAdapter(private val context: Context, private val data: MutableList<MyData>) : BaseAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false)

        val nameView = view.findViewById<TextView>(R.id.name)
        val phoneView = view.findViewById<TextView>(R.id.phone)
        val editBtn = view.findViewById<Button>(R.id.edit)
        val deleteBtn = view.findViewById<Button>(R.id.delete)

        val item = getItem(position) as MyData
        nameView.text = item.name
        phoneView.text = item.phone

        editBtn.setOnClickListener {
            val intent = Intent(context, EditActivity::class.java).apply {
                putExtra("position", position)
                putExtra("name", item.name)
                putExtra("phone", item.phone)
            }
            context.startActivity(intent)
        }

        deleteBtn.setOnClickListener {
            data.removeAt(position)
            notifyDataSetChanged()
        }

        return view
    }
}
