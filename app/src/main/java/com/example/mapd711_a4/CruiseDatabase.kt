package com.example.mapd711_a4

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CruiseModel::class], version = 1, exportSchema = false)
abstract class CruiseDatabase: RoomDatabase() {

    abstract fun cruiseDao(): CruiseDao

    companion object{
        @Volatile
        private var INSTANCE: CruiseDatabase? = null

        fun getDatabaseCus(context: Context) : CruiseDatabase {

            if(INSTANCE != null ) return INSTANCE!!

            synchronized(this){
                INSTANCE = Room.databaseBuilder(context, CruiseDatabase::class.java, "CUSTOMERDB")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE!!
            }
        }
    }
}