package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    //declaring the views
    lateinit var etPhone:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgot:TextView
    lateinit var txtRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //initialising the views
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        txtForgot=findViewById(R.id.txtForgot)
        txtRegister=findViewById(R.id.txtRegister)
        btnLogin =findViewById(R.id.btnLogin)

        txtForgot.setOnClickListener()
        {
            //start is to start next activity and intent to connect one activity to another
            startActivity(Intent(this@LoginActivity,ForgotPasswordActivity::class.java))
        }
        txtRegister.setOnClickListener()
        {
            startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
        }
        title="Log In"
        btnLogin.setOnClickListener()
        {
             val bundle=Bundle() //to send data from one activity ro another
            //key-value pair
            //here key is mobile no and value is data which is retrieved from user
            //putString to  store value in bundle taken from user
            bundle.putString("Mobile No",etPhone.text.toString())
            bundle.putString("Password",etPassword.text.toString())

            //putExtra is to send the retrieve data from one activity to another
            intent.putExtra("information",bundle)
            //intent creation to connect it to another activity
            startActivity(Intent(this@LoginActivity,DashboardActivity::class.java))


        }
    }
}