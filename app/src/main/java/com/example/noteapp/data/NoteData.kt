package com.example.noteapp.data

import com.example.noteapp.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Da1", description = "Do what you need"),
            Note(title = "Da2", description = "Do what you need"),
            Note(title = "Da3", description = "Do what you need"),
            Note(title = "Da4", description = "Do what you need"),
            Note(title = "Da5", description = "Do what you need"),
            Note(title = "Da6", description = "Do what you need"),
            Note(title = "Da7", description = "Do what you need"),
            Note(title = "Da8", description = "Do what you need"),
            Note(title = "Da9", description = "Do what you need"),
            Note(title = "Da10", description = "Do what you need"),
        )
    }
}