package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cooking : AppCompatActivity() {

    private lateinit var btn11: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking_description)

        btn11 = findViewById(R.id.btn11)

        btn11.setOnClickListener {
            val intent = Intent(this, SixWeekSummary::class.java)
            startActivity(intent)
        }
    }
}