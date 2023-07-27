package com.example.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Tareas::class], version = 1)
abstract class TareasDataBase : RoomDatabase() {
    abstract fun getTareasDao(): TareasDAO
    companion object {
        @Volatile
        private var INSTANCE: TareasDataBase? = null
        fun getDataBase(context: Context): TareasDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TareasDataBase::class.java,
                    "task_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

