package com.codehafeez.recycleview_example1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = listOf(
            MyData("Title 1", "Description 1", android.R.drawable.ic_dialog_email),
            MyData("Title 2", "Description 2", android.R.drawable.ic_dialog_info),
            MyData("Title 3", "Description 3", android.R.drawable.ic_delete),
            MyData("Title 4", "Description 4", android.R.drawable.ic_dialog_dialer)
        )

        val adapter = MyAdapter(data)
        recyclerView.adapter = adapter
    }
}