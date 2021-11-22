package com.example.mapd711_a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel


class CruiseViewModel : AppCompatActivity() {
    var liveCustomerData: LiveData<CruiseModel>? = null

    fun insertCustomer(context: Context, username: String, password: String, firstname: String, lastname: String,
                       address: String, city: String, postalCode: String,
                       telephone: String, email: String){
        CruiseRepository.insertCustomer(context, username, password,
            firstname, lastname, address, city, postalCode, telephone, email)
    }

    fun getCustomer(context: Context, username: String, password: String, firstname: String, lastname: String,
                    address: String, city: String, postalCode: String,
                    telephone: String, email: String) : LiveData<CruiseModel>{
        liveCustomerData = CruiseRepository.getCustomerDetails(context, username)
        return liveCustomerData!!

    }

    fun getLogin(context: Context, username: String, password: String) : LiveData<CruiseModel>{
        liveCustomerData = CruiseRepository.getLoginDetails(context, username, password)
        return liveCustomerData!!
    }

}