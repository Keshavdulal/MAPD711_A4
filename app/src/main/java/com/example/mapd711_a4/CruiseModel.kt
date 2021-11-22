package com.example.mapd711_a4

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Defining table name
@Entity(tableName = "customer")
data class CruiseModel(
    //Defining all the columns in the table
    @ColumnInfo(name = "username") var username : String,
    @ColumnInfo(name = "password") var password: String,
    @ColumnInfo(name = "firstname") var firstname: String,
    @ColumnInfo(name = "lastname") var lastname: String,
    @ColumnInfo(name = "address") var address: String,
    @ColumnInfo(name = "city") var city : String,
    @ColumnInfo(name = "postalCode") var postalCode: String,
    @ColumnInfo(name = "telephone") var telephone: String,
    @ColumnInfo(name = "email") var email: String

){
    //Defining the primary key.
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customerId") var customerId: Int? = null
}
