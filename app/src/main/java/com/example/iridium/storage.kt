package com.example.iridium

import android.util.Log

data class Note(var title:String,var date:String, var content:String)
public fun loadNotes() {
    Log.d("Iridium","Got Notes")
    var notes = Array<Note>(2){ Note("e","e","e") }
    return notes

}

public fun createNote() {
    var defaultText = "Tap here to edit your new note."
    Log.d("Iridium","New Note Created")
}
public fun saveNotes() {
    Log.d("Iridium","Note Modified")

}