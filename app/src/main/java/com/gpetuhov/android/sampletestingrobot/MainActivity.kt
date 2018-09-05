package com.gpetuhov.android.sampletestingrobot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Our business logic is as simple as that:
        // just display a TextView with a greeting for the entered name.
        processButton.setOnClickListener {
            resultText.text = String.format("Hello, %s!", nameInput.text)
            resultText.visibility = View.VISIBLE
        }
    }
}
