package com.example.better_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomePage extends AppCompatActivity {
    private Button remindersButton; //button to go to the user reminders page
    private Button toDoListButton; //button to go to the user to-do list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //code to go to the user reminder page
        remindersButton = (Button) findViewById(R.id.reminders);
        remindersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserReminders(); //call
            }
        });

        //code to go to the user to-do list page
        toDoListButton = (Button) findViewById(R.id.ToDoList);
        toDoListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserToDoList(); //call
            }
        });
    }

    //method to go to the user reminders page
    public void openUserReminders() {
        Intent intent = new Intent(this, UserReminders.class);
        startActivity(intent);

    }
    //method to go to the user to-do list page
    public void openUserToDoList() {
        Intent intent = new Intent(this, UserToDoList.class);
        startActivity(intent);

    }
}