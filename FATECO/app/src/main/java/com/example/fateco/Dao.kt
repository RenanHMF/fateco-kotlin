package com.example.fateco

import androidx.room.*
import androidx.room.Dao

@Dao
interface Dao {

    // Quero CRUD, Room!!! Me ajuda!!!
    // C: create (inserir um produto no banco)
    @Insert
    fun insertStats(stats: Stats)

    // R: read (consultar todos os produtos
    @Query("SELECT * FROM Stats")
    fun getStatsById(): MutableList<Stats>

    // U: update (alterar um produto)
    @Update
    fun setStats(stats: Stats)

    /*
    // D: delete (excluir um produto)
    @Delete
    fun excluirProduto(stats: Stats)*/
}