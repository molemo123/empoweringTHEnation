package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class childminding : AppCompatActivity() {

    private lateinit var btn10: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_childminding_description)

        btn10 = findViewById(R.id.btn10)

        btn10.setOnClickListener {
            val intent = Intent(this, SixWeekSummary::class.java)
            startActivity(intent)
        }
    }
}