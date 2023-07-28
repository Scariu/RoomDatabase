package com.example.roomdatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TareaViewModel (aplicacion: Application): AndroidViewModel(aplicacion){
    private val repositorio: Repositorio
    init{
        repositorio = Repositorio(TareasDataBase.getDataBase(aplicacion).getTareasDao())
    }
    fun obtenerTareas(): LiveData<List<Tareas>>{
        return repositorio.listarTareas()
    }
    fun insertarTarea(tareas: Tareas)= viewModelScope.launch{
        repositorio.insertTask(tareas)
    }
}