package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// PERHATIKAN: version diubah dari 1 menjadi 2!
@Database(entities = [Total::class], version = 2)
abstract class TotalDatabase : RoomDatabase() {
    abstract fun totalDao(): TotalDao
}