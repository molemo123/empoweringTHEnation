package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WhereToFindUs : AppCompatActivity() {

    private lateinit var btnGoBackToFeesCart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_where_to_find_us)

        btnGoBackToFeesCart = findViewById(R.id.btnGoBackToFeesCart)

        btnGoBackToFeesCart.setOnClickListener {
            val intent = Intent(this, FeesCalculateCart::class.java)
            startActivity(intent)
        }

    }
}