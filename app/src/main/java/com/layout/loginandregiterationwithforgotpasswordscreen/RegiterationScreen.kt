package com.layout.loginandregiterationwithforgotpasswordscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegiterationScreen : AppCompatActivity() {
    lateinit var tvRF:TextView
    lateinit var etREmail:EditText
    lateinit var etRPassword:EditText
    lateinit var etRCnPassword:EditText
    lateinit var etRName:EditText
    lateinit var btnRConfirm:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regiteration_screen)
        tvRF=findViewById(R.id.tvRF)
        etREmail=findViewById(R.id.etREmail)
        etRPassword=findViewById(R.id.etRPassword)
        etRCnPassword=findViewById(R.id.etRCnPassword)
        etRName=findViewById(R.id.etRName)
        btnRConfirm=findViewById(R.id.btnRConfirm)
        btnRConfirm.setOnClickListener{
            if(etREmail.text.isEmpty()){
                etREmail.error="Enter Your Email"
                etREmail.requestFocus()
            }else if(etRPassword.text.isEmpty()){
                etRPassword.error="Enter Your Password"
                etRPassword.requestFocus()
            }else if (etRCnPassword.text.isEmpty()){
                etRCnPassword.error="Confirm Your Password"
                etRCnPassword.requestFocus()
            }else if (etRName.text.isEmpty()){
                etRName.error="Enter Your Name"
            }else{
                var intent=Intent(this@RegiterationScreen,MainActivity::class.java)
                startActivity(intent)
            }
        }


    }
}