package com.example.aplikasisisteminformasiabsensiberbasisandroid.database.dao

import androidx.room.Database
import com.example.aplikasisisteminformasiabsensiberbasisandroid.model.ModelDatabase
import androidx.room.RoomDatabase
import com.example.aplikasisisteminformasiabsensiberbasisandroid.database.dao.DatabaseDao






@Database (entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun  databaseDao(): DatabaseDao?
}
