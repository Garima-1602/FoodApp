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
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgot:TextView
    lateinit var txtRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //initialising the views
        etEmail=findViewById(R.id.etEmail)
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
            val intent=Intent(this@LoginActivity,DashboardActivity::class.java)
             val bundle=Bundle() //to send data from one activity ro another
            //key-value pair
            //here key is mobile no and value is data which is retrieved from user
            //putString to  store value in bundle taken from user
            bundle.putString("data", "login")
            bundle.putString("Email",etEmail.text.toString())
            bundle.putString("Password",etPassword.text.toString())

            //putExtra is to send the retrieve data from one activity to another
            intent.putExtra("details",bundle)
            //intent creation to connect it to another activity
            startActivity(intent)


        }
    }
}