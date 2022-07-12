package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etemailaddress:EditText
    lateinit var etemobilenumber:EditText
    lateinit var etaddress:EditText
    lateinit var etpswd:EditText
    lateinit var etconfirmpassword:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
         title="Register"
        etname=findViewById(R.id.etname)
        etemailaddress=findViewById(R.id.etemailaddress)
        etemobilenumber=findViewById(R.id.etemobilenumber)
        etaddress=findViewById(R.id.etaddress)
        etpswd=findViewById(R.id.etpswd)
        etconfirmpassword=findViewById(R.id.etconfirmpassword)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener()
        {
            val intent= Intent(this@RegisterActivity,DashboardActivity::class.java)
            val bundle=Bundle()
            bundle.putString("data","register")
            bundle.putString("Name",etname.text.toString())
            bundle.putString("Email",etemailaddress.text.toString())
            bundle.putString("Mobile No",etemobilenumber.text.toString())
            bundle.putString("Address",etaddress.text.toString())
            bundle.putString("Password",etpswd.text.toString())
            bundle.putString("ConfirmPassword",etconfirmpassword.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)
        }
    }
}