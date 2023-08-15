package com.codehafeez.recycleview_example2
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class EditActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var updateBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        nameEditText = findViewById(R.id.nameEditText)
        phoneEditText = findViewById(R.id.phoneEditText)
        updateBtn = findViewById(R.id.updateBtn)

        val position = intent.getIntExtra("position", -1)
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")

        nameEditText.setText(name)
        phoneEditText.setText(phone)

        updateBtn.setOnClickListener {
            val position = intent.getIntExtra("position", -1)
            val newName = nameEditText.text.toString()
            val newPhone = phoneEditText.text.toString()

            val newItem = MyData(newName, newPhone)
            arrayList[position] = newItem

            // arrayList.removeAt(position) // delete item
            adapter?.notifyDataSetChanged()
            finish()
        }
    }
}