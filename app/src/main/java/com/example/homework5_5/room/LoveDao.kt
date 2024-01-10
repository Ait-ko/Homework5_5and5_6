package com.example.homework5_5.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.homework5_5.model.LoveModel

@Dao
interface LoveDao {

    @Query("SELECT * FROM `love-table` ORDER by firstName ASC")
    fun getAll(): List<LoveModel>

    @Insert
    fun insert(vararg model: LoveModel)
}