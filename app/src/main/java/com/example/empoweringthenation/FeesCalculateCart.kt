package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeesCalculateCart : AppCompatActivity() {

    private lateinit var btnBack: Button
    private lateinit var btnNext: Button
    private lateinit var btnCalculateCourse: Button

    // Main course selection buttons
    private lateinit var btnSelectSixMonth: Button
    private lateinit var btnSelectSixWeek: Button

    // Sub-course options for Six Month Course
    private lateinit var btnFirstAid: Button
    private lateinit var btnSewing: Button
    private lateinit var btnLandscaping: Button
    private lateinit var btnLifeSkills: Button

    // Sub-course options for Six Week Course
    private lateinit var btnChildMinding: Button
    private lateinit var btnGardenMaintenance: Button
    private lateinit var btnCooking: Button

    private lateinit var tvSelectedCourse: TextView

    private var selectedCourse: String? = null
    private var selectedSubCourse: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees_calculate_cart)

        // Initialize views
        btnBack = findViewById(R.id.btnBack)
        btnNext = findViewById(R.id.btnNext)
        btnCalculateCourse = findViewById(R.id.btnCalculateCourse)

        btnSelectSixMonth = findViewById(R.id.btnSelectSixMonth)
        btnSelectSixWeek = findViewById(R.id.btnSelectSixWeek)

        // Initialize Six Month sub-options
        btnFirstAid = findViewById(R.id.btnFirstAid)
        btnSewing = findViewById(R.id.btnSewing)
        btnLandscaping = findViewById(R.id.btnLandscaping)
        btnLifeSkills = findViewById(R.id.btnLifeSkills)

        // Initialize Six Week sub-options
        btnChildMinding = findViewById(R.id.btnChildMinding)
        btnGardenMaintenance = findViewById(R.id.btnGardenMaintenance)
        btnCooking = findViewById(R.id.btnCooking)

        tvSelectedCourse = findViewById(R.id.tvSelectedCourse)

        // Initially hide sub-options
        findViewById<View>(R.id.sixMonthOptions).visibility = View.GONE
        findViewById<View>(R.id.sixWeekOptions).visibility = View.GONE

        // Handle main course selection
        btnSelectSixMonth.setOnClickListener {
            selectedCourse = "Six Month Course"
            selectedSubCourse = null
            showSixMonthOptions()
            Toast.makeText(this, "Six Month Course selected", Toast.LENGTH_SHORT).show()
        }

        btnSelectSixWeek.setOnClickListener {
            selectedCourse = "Six Week Course"
            selectedSubCourse = null
            showSixWeekOptions()
            Toast.makeText(this, "Six Week Course selected", Toast.LENGTH_SHORT).show()
        }

        // Handle sub-course selection for Six Month Course
        btnFirstAid.setOnClickListener {
            selectedSubCourse = "First Aid"
            Toast.makeText(this, "First Aid selected", Toast.LENGTH_SHORT).show()
        }

        btnSewing.setOnClickListener {
            selectedSubCourse = "Sewing"
            Toast.makeText(this, "Sewing selected", Toast.LENGTH_SHORT).show()
        }

        btnLandscaping.setOnClickListener {
            selectedSubCourse = "Landscaping"
            Toast.makeText(this, "Landscaping selected", Toast.LENGTH_SHORT).show()
        }

        btnLifeSkills.setOnClickListener {
            selectedSubCourse = "Life Skills"
            Toast.makeText(this, "Life Skills selected", Toast.LENGTH_SHORT).show()
        }

        // Handle sub-course selection for Six Week Course
        btnChildMinding.setOnClickListener {
            selectedSubCourse = "Child Minding"
            Toast.makeText(this, "Child Minding selected", Toast.LENGTH_SHORT).show()
        }

        btnGardenMaintenance.setOnClickListener {
            selectedSubCourse = "Garden Maintenance"
            Toast.makeText(this, "Garden Maintenance selected", Toast.LENGTH_SHORT).show()
        }

        btnCooking.setOnClickListener {
            selectedSubCourse = "Cooking"
            Toast.makeText(this, "Cooking selected", Toast.LENGTH_SHORT).show()
        }

        // Calculate and display selected course and sub-course
        btnCalculateCourse.setOnClickListener {
            if (selectedCourse != null && selectedSubCourse != null) {
                tvSelectedCourse.text = "Selected: $selectedCourse - $selectedSubCourse"
            } else {
                Toast.makeText(this, "Please select a course and sub-course", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle back button
        btnBack.setOnClickListener {
            startActivity(Intent(this, SixMonthSummary::class.java))
        }

        // Handle next button
        btnNext.setOnClickListener {
            startActivity(Intent(this, WhereToFindUs::class.java))
        }
    }

    private fun showSixMonthOptions() {
        findViewById<View>(R.id.sixMonthOptions).visibility = View.VISIBLE
        findViewById<View>(R.id.sixWeekOptions).visibility = View.GONE
    }

    private fun showSixWeekOptions() {
        findViewById<View>(R.id.sixWeekOptions).visibility = View.VISIBLE
        findViewById<View>(R.id.sixMonthOptions).visibility = View.GONE
    }
}


