package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixMonthSummary : AppCompatActivity() {

    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btnFirstAid: Button
    private lateinit var btnSewing: Button
    private lateinit var btnLandScaping: Button
    private lateinit var btnLifeSkills: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_summary)

        btn2 = findViewById(R.id.btn2)

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn3 = findViewById(R.id.btn3)

        btn3.setOnClickListener {
            val intent = Intent(this, SixWeekSummary::class.java)
            startActivity(intent)
        }

        btnFirstAid = findViewById(R.id.btnFirstAid)

        btnFirstAid.setOnClickListener{
            val intent = Intent(this, firstaid_description::class.java)
            startActivity(intent)
        }

        btnSewing = findViewById(R.id.btnSewing)

        btnSewing.setOnClickListener{
            val intent = Intent(this, SewingDescription::class.java)
            startActivity(intent)
        }

        btnLandScaping = findViewById(R.id.btnLandscaping)

        btnLandScaping.setOnClickListener{
            val intent = Intent(this, landscaping::class.java)
            startActivity(intent)
        }

        btnLifeSkills = findViewById(R.id.btnLifeSkills)

        btnLifeSkills.setOnClickListener{
            val intent = Intent(this, LifeSkillsDescription::class.java)
            startActivity(intent)
        }
    }
}