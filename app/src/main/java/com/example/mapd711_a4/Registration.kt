package com.example.mapd711_a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.content.Context
import android.widget.Toast


class Registration : AppCompatActivity() {

    lateinit var cruiseViewModel: CruiseViewModel
    lateinit var context: Context

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

        //consider the Main Activity as a current context
        context = this@Registration

        //initializing studentModel Object
        cruiseViewModel = ViewModelProvider(this).get(CruiseViewModel::class.java)


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


        buttonRegister.setOnClickListener{
            username = usernameEdit.text.toString().trim()
            password = passwordEdit.text.toString().trim()
            firstname = firstnameEdit.text.toString().trim()
            lastname = lastnameEdit.text.toString().trim()
            address = addressEdit.text.toString().trim()
            city = cityEdit.text.toString().trim()
            postalCode = postalCodeEdit.text.toString().trim()
            telephone = telephoneEdit.text.toString().trim()
            email = emailEdit.text.toString().trim()


            //validation for the empty values
            if (username.isEmpty() || password.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || address.isEmpty()
                || city.isEmpty() || postalCode.isEmpty() || telephone.isEmpty() || email.isEmpty()){
                Toast.makeText(context, "Enter Fields", Toast.LENGTH_LONG).show()
            }
            else{
                cruiseViewModel.insertCustomer(context, username, password, firstname, lastname, address, city, postalCode, telephone, email)
            }

        }
    }
}


