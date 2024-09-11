package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SewingDescription : AppCompatActivity() {

    private lateinit var btn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing_description)

        btn5 = findViewById(R.id.btn5)

        btn5.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }
    }
}