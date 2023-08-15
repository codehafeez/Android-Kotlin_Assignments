package com.codehafeez.recycleview_example2
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class MyAdapter(var data: List<MyData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.title.text = item.name
        holder.description.text = item.phone

        holder.editBtn.setOnClickListener {
            val intent = Intent(it.context, EditActivity::class.java).apply {
                putExtra("position", position)
                putExtra("name", item.name)
                putExtra("phone", item.phone)
            }
            it.context.startActivity(intent)
        }

        holder.deleteBtn.setOnClickListener {
            arrayList.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.name)
        val description: TextView = view.findViewById(R.id.phone)
        val editBtn = view.findViewById<Button>(R.id.edit)
        val deleteBtn = view.findViewById<Button>(R.id.delete)
    }
}
