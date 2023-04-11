package com.example.notebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnAddNote;
    ArrayList<Note> notes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddNote = findViewById(R.id.btnAddNote);
        notes = new ArrayList<>();
        notes.add(new Note("Note1" ,"Cat1","Desc1"));
        notes.add(new Note("Note2" ,"Cat1","Desc1"));
        notes.add(new Note("Note3" ,"Cat1","Desc1"));
        notes.add(new Note("Note4" ,"Cat1","Desc1"));
        notes.add(new Note("Note5" ,"Cat1","Desc1"));
        RecyclerView  rv= findViewById(R.id.rvNotes);
        rv.setAdapter(new NotesAdaptar(notes));

        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NoteActivity.class);
                startActivity(intent);
            }
        });
    }
}