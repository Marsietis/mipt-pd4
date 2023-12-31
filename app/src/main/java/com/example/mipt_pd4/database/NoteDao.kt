package com.example.mipt_pd4.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): List<Note>

    @Query("SELECT * FROM note WHERE name = :name")
    fun getNoteByName(name: String): Note?

    @Insert
    fun insertAll(vararg note: Note)

    @Delete
    fun delete(note: Note)
}