
package com.trikego.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)

            val tv = TextView(this)
            tv.text = "TrikeGo Sariaya\n\nApp started successfully!"
            tv.textSize = 24f
            tv.setTextColor(Color.BLACK)
            tv.gravity = Gravity.CENTER

            setContentView(tv)

        } catch (e: Exception) {
            val error = TextView(this)
            error.text = "TRIKEGO ERROR\n\n${e.javaClass.name}\n\n${e.message}"
            error.textSize = 18f
            error.setTextColor(Color.RED)
            error.gravity = Gravity.CENTER
            error.setPadding(30, 30, 30, 30)

            setContentView(error)
        }
    }
}
