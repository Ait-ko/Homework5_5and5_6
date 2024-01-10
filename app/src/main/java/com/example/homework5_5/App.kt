package com.example.homework5_5

import android.app.Application
import androidx.room.Room
import com.example.homework5_5.room.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "love-file")
            .allowMainThreadQueries().build()
    }
}