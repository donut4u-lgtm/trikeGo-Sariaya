
package com.trikego.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 100, 40, 40)

        val passenger = Button(this)
        passenger.text = "PASSENGER"

        passenger.setOnClickListener {
            Toast.makeText(
                this,
                "PASSENGER BUTTON WORKS",
                Toast.LENGTH_LONG
            ).show()
        }

        val driver = Button(this)
        driver.text = "DRIVER"

        driver.setOnClickListener {
            Toast.makeText(
                this,
                "DRIVER BUTTON WORKS",
                Toast.LENGTH_LONG
            ).show()
        }

        val admin = Button(this)
        admin.text = "ADMIN"

        admin.setOnClickListener {
            Toast.makeText(
                this,
                "ADMIN BUTTON WORKS",
                Toast.LENGTH_LONG
            ).show()
        }

        layout.addView(passenger)
        layout.addView(driver)
        layout.addView(admin)

        setContentView(layout)
    }
}
