package com.example.noteapp.data

import java.time.LocalDateTime
import java.util.UUID

data class Note(
    val id: UUID = UUID.randomUUID(), // create random IDs for you
    var title: String,
    var description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
)
