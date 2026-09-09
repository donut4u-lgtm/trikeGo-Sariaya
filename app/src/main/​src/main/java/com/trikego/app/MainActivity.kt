
package com.trikego.app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnPassenger).setOnClickListener {
            Toast.makeText(this, "Passenger Mode Clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnDriver).setOnClickListener {
            Toast.makeText(this, "Driver Mode Clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnAdmin).setOnClickListener {
            Toast.makeText(this, "Admin Mode Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
