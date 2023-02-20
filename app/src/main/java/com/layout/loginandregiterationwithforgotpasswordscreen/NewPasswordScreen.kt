package com.layout.loginandregiterationwithforgotpasswordscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewPasswordScreen : AppCompatActivity() {
    lateinit var etNewPassword:EditText
    lateinit var etCNPassword:EditText
    lateinit var btnNewPassLogin:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_passwoed_screen)
        etNewPassword=findViewById(R.id.etNewPassword)
        etCNPassword=findViewById(R.id.etCNPassword)
        btnNewPassLogin=findViewById(R.id.btnNewPassLogin)
        btnNewPassLogin.setOnClickListener{
            if (etNewPassword.text.isEmpty()){
                etNewPassword.error="Enter YOUr New Password"
                etNewPassword.requestFocus()
            }else if (etCNPassword.text.isEmpty()){
                etCNPassword.error="Confirm Your Password"
                etCNPassword.requestFocus()
            }else{
                var intent=Intent(this@NewPasswordScreen,MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}