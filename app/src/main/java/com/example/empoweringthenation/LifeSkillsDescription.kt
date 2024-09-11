package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LifeSkillsDescription : AppCompatActivity() {

    private lateinit var btn4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills_description)

        btn4 = findViewById(R.id.btn4)

        btn4.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }
    }
}