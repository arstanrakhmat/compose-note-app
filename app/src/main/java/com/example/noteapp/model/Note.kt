package com.example.noteapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity(tableName = "notes_tbl")
data class Note(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(), // create random IDs for you

    @ColumnInfo("note_title")
    var title: String,

    @ColumnInfo("note_description")
    var description: String,

    @ColumnInfo("note_entry_date")
    val entryDate: Date = Date.from(Instant.now())
)
