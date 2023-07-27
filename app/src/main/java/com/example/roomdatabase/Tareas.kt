package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_tareas")
data class Tareas(val nombre: String, val fecha: String){
@PrimaryKey(autoGenerate = true) var id: Long = 1
}