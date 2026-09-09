
package com.trikego.app

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(60, 60, 60, 60)
            gravity = Gravity.CENTER_HORIZONTAL
        }

        val title = TextView(this).apply {
            text = "TrikeGo Sariaya"
            textSize = 26f
            setPadding(0, 40, 0, 80)
            gravity = Gravity.CENTER
        }
        layout.addView(title)

        val btnPassenger = Button(this).apply {
            text = "Passenger Mode"
            setPadding(20, 30, 20, 30)
        }
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(0, 20, 0, 20)
        }
        layout.addView(btnPassenger, params)

        val btnDriver = Button(this).apply {
            text = "Driver Mode"
            setPadding(20, 30, 20, 30)
        }
        layout.addView(btnDriver, params)

        val btnAdmin = Button(this).apply {
            text = "Admin Sign-In"
            setPadding(20, 30, 20, 30)
        }
        layout.addView(btnAdmin, params)

        setContentView(layout)
    }
}
