package com.example.mapd711_a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class Registration : AppCompatActivity() {
    lateinit var username: String
    lateinit var password: String
    lateinit var firstname: String
    lateinit var lastname: String
    lateinit var address: String
    lateinit var city: String
    lateinit var postalCode: String
    lateinit var telephone: String
    lateinit var email: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        var buttonRegister: Button = findViewById(R.id.register_btn)
        var usernameEdit: EditText = findViewById(R.id.username_tf)
        var passwordEdit: EditText = findViewById(R.id.password_tf)
        var firstnameEdit: EditText = findViewById(R.id.firstname_tf)
        var lastnameEdit: EditText = findViewById(R.id.lastname_tf)
        var addressEdit: EditText = findViewById(R.id.address_tf)
        var cityEdit: EditText = findViewById(R.id.city_tf)
        var postalCodeEdit: EditText = findViewById(R.id.postalCode_tf)
        var telephoneEdit: EditText = findViewById(R.id.telephone_tf)
        var emailEdit: EditText = findViewById(R.id.email_tf)


    }
}