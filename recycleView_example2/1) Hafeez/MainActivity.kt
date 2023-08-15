package com.codehafeez.recycleview_example2
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        arrayList.add(MyData("Hafeez", "2342343242"))
        arrayList.add(MyData("Azhar", "322532345"))
        arrayList.add(MyData("Noman", "3423433"))
        adapter = MyAdapter(arrayList)
        recyclerView.adapter = adapter
    }

    fun addItemFunction(view: View) {
        arrayList.add(MyData("New Item", "234234334"))
        adapter?.notifyDataSetChanged()
    }

}
