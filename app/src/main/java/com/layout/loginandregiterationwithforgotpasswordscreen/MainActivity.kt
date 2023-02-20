package com.layout.loginandregiterationwithforgotpasswordscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var tvDontHaveAccount:TextView
    lateinit var tvForgotPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        tvDontHaveAccount=findViewById(R.id.tvDontHaveAccount)
        tvForgotPassword=findViewById(R.id.tvForgotPassword)
        btnLogin.setOnClickListener{
            if (etEmail.text.isEmpty()){
                etEmail.error="Enter Your Email"
                etEmail.requestFocus()
            }else{
                etPassword.error="Enter Your Password"

            }
        }
        tvDontHaveAccount.setOnClickListener{
            var intent=Intent(this@MainActivity,RegiterationScreen::class.java)
            startActivity(intent)
        }
        tvForgotPassword.setOnClickListener{
            var intent=Intent(this@MainActivity,ForgetPasswordScreen::class.java)
            startActivity(intent)
        }

    }
    }
