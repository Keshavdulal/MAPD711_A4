package com.example.mapd711_a4

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CruiseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCustomer(customer: CruiseModel)

    @Query("SELECT * FROM customer WHERE userName =:username AND password=:password ORDER BY customerId ASC")
    fun getLoginDetails(userName: String, password: String): LiveData<CruiseModel>

    @Query("SELECT * FROM customer WHERE userName =:username")
    fun getCustomer(userName: String) : LiveData<CruiseModel>

}