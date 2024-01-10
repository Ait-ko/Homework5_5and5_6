package com.example.homework5_5.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.homework5_5.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

abstract fun getDao(): LoveDao
}