package com.example.roomdatabase

import androidx.lifecycle.LiveData

class Repositorio (private val tareasDAO: TareasDAO){
    suspend fun insertTask(tareas: Tareas){
        tareasDAO.insertarTareas(tareas)//Insertar tarea
    }

    fun listarTareas(): LiveData<List<Tareas>>{
        return tareasDAO.getTareas()//Obtener tarea
    }
}