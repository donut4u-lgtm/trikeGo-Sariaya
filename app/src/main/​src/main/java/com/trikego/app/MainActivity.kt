
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
        showMainScreen()
    }

    private fun showMainScreen() {
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
                // Direct UI replacement test
                val passengerLayout = LinearLayout(this@MainActivity).apply {
                    orientation = LinearLayout.VERTICAL
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                    setPadding(50, 80, 50, 50)
                    setBackgroundColor(Color.WHITE)
                }

                val pTitle = TextView(this@MainActivity).apply {
                    text = "Passenger Booking"
                    textSize = 24f
                    setTextColor(Color.BLACK)
                    setPadding(0, 0, 0, 40)
                }
                passengerLayout.addView(pTitle)

                val inputPickup = EditText(this@MainActivity).apply {
                    hint = "Enter Pickup Location"
                    setTextColor(Color.BLACK)
                    setHintTextColor(Color.GRAY)
                }
                passengerLayout.addView(inputPickup, LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply { setMargins(0, 0, 0, 20) })

                val inputDestination = EditText(this@MainActivity).apply {
                    hint = "Enter Destination"
                    setTextColor(Color.BLACK)
                    setHintTextColor(Color.GRAY)
                }
                passengerLayout.addView(inputDestination, LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply { setMargins(0, 0, 0, 40) })

                val btnBook = Button(this@MainActivity).apply {
                    text = "FIND TRICYCLE"
                }
                passengerLayout.addView(btnBook, LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ))

                setContentView(passengerLayout)
            }
        }
        rootLayout.addView(btnPassenger, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply { setMargins(0, 20, 0, 20) })

        setContentView(rootLayout)
    }
}
