package com.example.empoweringthenation

import android.content.Intent
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private var isFirstLoad = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationSpinner: Spinner = findViewById(R.id.drpMenu)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.Menu,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        navigationSpinner.adapter = adapter

        navigationSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (isFirstLoad) {

                    isFirstLoad = false
                } else {
                    when (position) {
                        0 -> startActivity(Intent(this@MainActivity, SixWeekSummary::class.java))
                        1 -> startActivity(Intent(this@MainActivity, SixMonthSummary::class.java))
                        2 -> startActivity(Intent(this@MainActivity, WhereToFindUs::class.java))
                        3 -> startActivity(Intent(this@MainActivity, FeesCalculateCart::class.java))
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            val intent = Intent(this, SixMonthSummary::class.java)
            startActivity(intent)
        }
    }
}