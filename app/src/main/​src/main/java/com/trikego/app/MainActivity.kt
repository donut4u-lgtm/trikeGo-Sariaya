
package com.trikego.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.setDefaultUncaughtExceptionHandler { _, throwable ->

            val message = buildString {
                append("TRIKEGO CRASH\n\n")
                append(throwable.javaClass.name)
                append("\n\n")
                append(throwable.message ?: "No message")
                append("\n\n")
                append(
                    throwable.stackTraceToString()
                        .take(4000)
                )
            }

            runOnUiThread {
                val tv = TextView(this)
                tv.text = message
                tv.textSize = 14f
                tv.setTextColor(Color.RED)
                tv.setGravity(Gravity.START)
                tv.setPadding(20, 40, 20, 40)
                setContentView(tv)
            }
        }

        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.text = "TrikeGo Sariaya\n\nStarting..."
        tv.textSize = 24f
        tv.setTextColor(Color.BLACK)
        tv.gravity = Gravity.CENTER

        setContentView(tv)
    }
}
