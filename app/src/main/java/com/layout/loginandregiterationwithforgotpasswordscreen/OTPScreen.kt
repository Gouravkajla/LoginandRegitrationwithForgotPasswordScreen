package com.layout.loginandregiterationwithforgotpasswordscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OTPScreen : AppCompatActivity() {
     private lateinit var tvEmailOTP:TextView
     private lateinit var btnOtpConfirm:Button
     private lateinit var etOTP:EditText
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpscreen)
        tvEmailOTP=findViewById(R.id.tvEmailOTP)
        btnOtpConfirm=findViewById(R.id.btnOtpConfirm)
        etOTP=findViewById(R.id.etOTP)
        intent?.let {
            val email=intent.getStringExtra("Email")
            tvEmailOTP.text = email

                }
      btnOtpConfirm.setOnClickListener {
            if (etOTP.text.toString().length<6){
                etOTP.error="Enter Your  6 digit Otp"
                etOTP.requestFocus()
            }else{
                val intent=Intent(this,NewPasswordScreen::class.java)
                startActivity(intent)

            }

        }}}


