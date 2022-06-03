package com.example.fateco

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Stats (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val carrerHigh : Int,
    val gamesPlayed : Int,
    val gamesWon : Int,
    val streak : Int
)