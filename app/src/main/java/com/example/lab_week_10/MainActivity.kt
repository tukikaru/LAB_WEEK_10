package com.example.lab_week_10

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var total: Int = 0 // [cite: 56]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        total = 0 // [cite: 60]
        updateText(total) // [cite: 61]

        findViewById<Button>(R.id.button_increment).setOnClickListener { // [cite: 64]
            incrementTotal() // [cite: 65]
        }
    }

    private fun incrementTotal() {
        total++ // [cite: 69]
        updateText(total) // [cite: 70]
    }

    private fun updateText(total: Int) {
        findViewById<TextView>(R.id.text_total).text = // [cite: 73]
            getString(R.string.text_total, total) // [cite: 74]
    }
}