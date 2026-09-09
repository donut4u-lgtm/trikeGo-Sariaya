
package com.trikego.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a vertical layout container
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(60, 60, 60, 60)
        }

        // Title text
        val title = TextView(this).apply {
            text = "TrikeGo Sariaya"
            textSize = 28f
            setPadding(0, 0, 0, 40)
        }
        layout.addView(title)

        // Passenger Button
        val btnPassenger = Button(this).apply {
            text = "Passenger Mode"
            setOnClickListener {
                // TODO: Launch Passenger Activity
            }
        }
        layout.addView(btnPassenger)

        // Driver Button
        val btnDriver = Button(this).apply {
            text = "Driver Mode"
            setOnClickListener {
                // TODO: Launch Driver Activity
            }
        }
        layout.addView(btnDriver)

        // Admin Sign-In Button
        val btnAdmin = Button(this).apply {
            text = "Admin Sign-In"
            setOnClickListener {
                // TODO: Launch Admin Login Activity
            }
        }
        layout.addView(btnAdmin)

        setContentView(layout)
    }
}
