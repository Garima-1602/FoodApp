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
 //as intent is used to connect one activity to another
        //now to check if any data is received or not
        if(intent!=null)
        {
            //to fetch details from intent we use getExtra
            val details=intent.getBundleExtra("details") //take
            //getting the value of data
            val data= details?.getString("data")
            if(data=="login")
            {
                val text="Email: ${details.getString("Email")} \n" +
                        "Password : ${details.getString("Password")}"
                txtReceived.text=text
            }
            if(data=="forgot")
            {
                val text="Email: ${details.getString("Email")} \n" +
                        "Password : ${details.getString("Pswd")}"
                txtReceived.text=text
            }
            if(data=="register")
            {
                val text="Name ${details.getString("Name")}\n"+
                        "Email: ${details.getString("Email")} \n" +
                        "Mobile No:  ${details.getString("Mobile No")}\n" +
                        "Address : ${details.getString("Address")}\n" +
                        "Password : ${details.getString("Password")}" +
                        "Confirm Password: ${details.getString("ConfirmPassword")}"
                txtReceived.text=text
            }


        }
        else
        {
            txtReceived.text="No data Recevied"
        }


    }
}