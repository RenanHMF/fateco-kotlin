package com.example.fateco

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Stats::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun dao(): Dao
}