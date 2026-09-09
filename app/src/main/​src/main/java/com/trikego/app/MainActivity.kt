
package com.trikego.app

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showHomeMenu()
    }

    private fun showHomeMenu() {
        val rootLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setPadding(60, 120, 60, 60)
            setBackgroundColor(Color.parseColor("#F5F5F5"))
        }

        val title = TextView(this).apply {
            text = "TrikeGo Sariaya"
            textSize = 28f
            setTextColor(Color.parseColor("#1B5E20"))
            setPadding(0, 0, 0, 60)
        }
        rootLayout.addView(title)

        val btnPassenger = Button(this).apply {
            text = "PASSENGER MODE"
            textSize = 16f
            setBackgroundColor(Color.parseColor("#2E7D32"))
            setTextColor(Color.WHITE)
            setOnClickListener {
                showPassengerScreen()
            }
        }
        rootLayout.addView(btnPassenger, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            150
        ).apply { setMargins(0, 20, 0, 30) })

        val btnDriver = Button(this).apply {
            text = "DRIVER MODE"
            textSize = 16f
            setBackgroundColor(Color.parseColor("#1565C0"))
            setTextColor(Color.WHITE)
            setOnClickListener {
                // Driver mode placeholder
            }
        }
        rootLayout.addView(btnDriver, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            150
        ).apply { setMargins(0, 0, 0, 20) })

        setContentView(rootLayout)
    }

    private fun showPassengerScreen() {
        val passengerLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setPadding(60, 100, 60, 60)
            setBackgroundColor(Color.WHITE)
        }

        val pTitle = TextView(this).apply {
            text = "Passenger Booking"
            textSize = 24f
            setTextColor(Color.parseColor("#1B5E20"))
            setPadding(0, 0, 0, 40)
        }
        passengerLayout.addView(pTitle)

        val inputPickup = EditText(this).apply {
            hint = "Enter Pickup Location"
            setTextColor(Color.BLACK)
            setHintTextColor(Color.GRAY)
            setPadding(20, 20, 20, 20)
        }
        passengerLayout.addView(inputPickup, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 0, 0, 30) })

        val inputDestination = EditText(this).apply {
            hint = "Enter Destination"
            setTextColor(Color.BLACK)
            setHintTextColor(Color.GRAY)
            setPadding(20, 20, 20, 20)
        }
        passengerLayout.addView(inputDestination, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 0, 0, 50) })

        val btnBook = Button(this).apply {
            text = "FIND TRICYCLE"
            textSize = 16f
            setBackgroundColor(Color.parseColor("#2E7D32"))
            setTextColor(Color.WHITE)
            setOnClickListener {
                pTitle.text = "Searching for Tricycle..."
            }
        }
        passengerLayout.addView(btnBook, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            150
        ))

        val btnBack = Button(this).apply {
            text = "BACK TO HOME"
            textSize = 14f
            setBackgroundColor(Color.parseColor("#757575"))
            setTextColor(Color.WHITE)
            setOnClickListener {
                showHomeMenu()
            }
        }
        passengerLayout.addView(btnBack, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            120
        ).apply { setMargins(0, 40, 0, 0) })

        setContentView(passengerLayout)
    }
}
