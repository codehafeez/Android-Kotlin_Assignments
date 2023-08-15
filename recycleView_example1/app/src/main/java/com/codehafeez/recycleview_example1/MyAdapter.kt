package com.codehafeez.recycleview_example1
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
class MyAdapter(private val data: List<MyData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.title.text = item.title
        holder.description.text = item.description
        holder.iconImageView.setImageResource(item.icon)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val title: TextView = view.findViewById(R.id.textView1)
        val description: TextView = view.findViewById(R.id.textView2)
        val iconImageView: ImageView = view.findViewById(R.id.imageView1)


        // item click listener
        init { view.setOnClickListener(this) }
        override fun onClick(view: View?) {
            val item = data[adapterPosition]
            val message = "Title: ${item.title}, Description: ${item.description}"
            Toast.makeText(view?.context, message, Toast.LENGTH_SHORT).show()
        }
    }
}
