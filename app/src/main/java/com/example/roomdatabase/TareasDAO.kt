package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TareasDAO {
    @Insert
    suspend fun  insertarTareas(tareas: Tareas)
}