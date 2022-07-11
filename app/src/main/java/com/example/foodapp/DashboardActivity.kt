package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    lateinit var txtReceived:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        txtReceived=findViewById(R.id.txtReceived)

        if(intent!=null) {
            val details = intent.getBundleExtra("details")
            txtReceived.text = details.toString()
        }
        else
        {
            txtReceived.text = "No data Found"
        }

    }
}