package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class landscaping : AppCompatActivity() {

    private lateinit var btn7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        btn7 = findViewById(R.id.btn7)

        btn7.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }
    }
}