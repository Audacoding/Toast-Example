package com.audacoding.toastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShow = findViewById<Button>(R.id.btn_show)
        btnShow.setOnClickListener {
            Toast.makeText(this, getString(R.string.hello_there), Toast.LENGTH_LONG).show()
        }
    }
}