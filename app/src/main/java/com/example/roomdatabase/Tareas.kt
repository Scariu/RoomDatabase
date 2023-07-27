package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla tareas")
class Tareas(val nombre: String, val fecha: String)
@PrimaryKey(autoGenerate = true) var id = 0
