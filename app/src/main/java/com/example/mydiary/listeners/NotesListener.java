package com.example.mydiary.listeners;

import com.example.mydiary.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
