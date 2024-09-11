package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstaid_description : AppCompatActivity() {

    private lateinit var btn6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstaid_description)

       btn6 = findViewById(R.id.btn6)

        btn6.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }

    }
}