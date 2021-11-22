package com.example.mapd711_a4

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.mapd711_a4.CruiseDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class CruiseRepository() {

    companion object {
        var cruiseDatabase: CruiseDatabase? = null
        var cruiseModel: LiveData<CruiseModel>? = null

        //initialize database
        fun initializeDB(context: Context): CruiseDatabase {
            return CruiseDatabase.getDatabaseCus(context)
        }

        //Initialize insertCustomer()
        fun insertCustomer(
            context: Context, username: String,
            password: String, firstname: String, lastname: String,
            address: String, city: String, postalCode: String,
            telephone: String, email: String
        ) {
            cruiseDatabase = initializeDB(context)

            CoroutineScope(IO).launch {
                val customerDetails = CruiseModel(
                    username, password,
                    firstname, lastname, address, city, postalCode, telephone, email
                )
                cruiseDatabase!!.cruiseDao().addCustomer(customerDetails)
            }

        }

        fun getCustomerDetails(context: Context, firstName: String) : LiveData<CruiseModel>{
            cruiseDatabase = initializeDB(context)
            cruiseModel = cruiseDatabase!!.cruiseDao().getCustomer(firstName)
            return cruiseModel!!
        }

        fun getLoginDetails(
            context: Context,
            userName: String,
            password: String
        ): LiveData<CruiseModel>? {
            cruiseDatabase = initializeDB(context)
            cruiseModel = cruiseDatabase!!.cruiseDao().getLoginDetails(userName, password)
            return cruiseModel
        }
    }
}


