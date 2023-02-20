package com.layout.loginandregiterationwithforgotpasswordscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgetPasswordScreen : AppCompatActivity() {
    lateinit var tvFP:TextView
    lateinit var etYourMail:EditText
    lateinit var btnOTP:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password_screen)
        tvFP=findViewById(R.id.tvFP)
        etYourMail=findViewById(R.id.etYourMail)
        btnOTP=findViewById(R.id.btnOTP)
        btnOTP.setOnClickListener{
            if (etYourMail.text.isEmpty()){
                etYourMail.error="Enter Your Mail"
                etYourMail.requestFocus()
            }else{
                var intent=Intent(this@ForgetPasswordScreen,OTPScreen::class.java)
                intent.putExtra("Email",etYourMail.text.toString())
                startActivity(intent)
            }
        }
    }

}