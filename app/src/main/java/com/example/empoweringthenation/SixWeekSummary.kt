package com.example.empoweringthenation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class SixWeekSummary : AppCompatActivity() {

    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btnChildMinding: Button
    private lateinit var btnGardenMaintenance: Button
    private lateinit var btnCooking: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_summary)

        btn8 = findViewById(R.id.btn8)

        btn8.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }

        btn9 = findViewById(R.id.btn9)

        btn9.setOnClickListener {
            val intent = Intent(this, FeesCalculateCart::class.java)
            startActivity(intent)
        }

        btnChildMinding = findViewById(R.id.btnChildMinding)

        btnChildMinding.setOnClickListener {
            val intent = Intent(this, childminding::class.java)
            startActivity(intent)
        }

        btnGardenMaintenance = findViewById(R.id.btnGardenMaintenance)

        btnGardenMaintenance.setOnClickListener{
            val intent = Intent(this, gardenmaintenance::class.java)
            startActivity(intent)
        }

        btnCooking = findViewById(R.id.btnCooking)

        btnCooking.setOnClickListener{
            val intent = Intent(this, cooking::class.java)
            startActivity(intent)
        }

    }
}