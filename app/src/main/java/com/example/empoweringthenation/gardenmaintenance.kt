package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gardenmaintenance : AppCompatActivity() {

    private lateinit var btn12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gardenmaintenance_description)

        btn12 = findViewById(R.id.btn12)

        btn12.setOnClickListener {
            val intent = Intent(this, SixWeekSummary::class.java)
            startActivity(intent)
        }
    }
}