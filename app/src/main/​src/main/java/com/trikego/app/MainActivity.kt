
package com.trikego.app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setPadding(50, 100, 50, 50)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "TrikeGo Sariaya"
            textSize = 28f
            setTextColor(Color.BLACK)
            setPadding(0, 0, 0, 60)
        }
        rootLayout.addView(title)

        val btnPassenger = Button(this).apply {
            text = "PASSENGER MODE"
            setOnClickListener {
                val intent = Intent(this@MainActivity, PassengerActivity::class.java)
                startActivity(intent)
            }
        }
        rootLayout.addView(btnPassenger, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 20, 0, 20) })

        val btnDriver = Button(this).apply {
            text = "DRIVER MODE"
            setOnClickListener {
                // TODO: Driver Mode navigation
            }
        }
        rootLayout.addView(btnDriver, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 20, 0, 20) })

        val btnAdmin = Button(this).apply {
            text = "ADMIN SIGN-IN"
            setOnClickListener {
                // TODO: Admin Sign-In navigation
            }
        }
        rootLayout.addView(btnAdmin, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 20, 0, 20) })

        setContentView(rootLayout)
    }
}
