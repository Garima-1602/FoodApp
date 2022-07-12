package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var etEmailadd:EditText
    lateinit var etePswd:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        etEmailadd=findViewById(R.id.etEmailadd)
        etePswd=findViewById(R.id.etePswd)
        btnNext =findViewById(R.id.btnNext)
        btnNext.setOnClickListener()
        {
            val intent=Intent(this@ForgotPasswordActivity,DashboardActivity::class.java)
            val bundle=Bundle()
            bundle.putString("data","forgot")
            bundle.putString("Email",etEmailadd.text.toString())
            bundle.putString("Pswd",etePswd.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)

        }
    }

}