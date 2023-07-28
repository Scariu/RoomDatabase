package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TareasDAO {
    @Insert
    suspend fun  insertarTareas(tareas: Tareas)

    @Query("select * from tabla_tareas order by id ASC")
    fun getTareas(): LiveData<List<Tareas>>
}