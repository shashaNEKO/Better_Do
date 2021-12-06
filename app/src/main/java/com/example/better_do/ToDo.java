package com.example.better_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ToDo extends AppCompatActivity {
    private ImageView home; //button to go to home page
    private ImageView backArrow; //button to go back to to-do page
    //private Button doneButton; //button to add/edit to-do list then go back to user to-do page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        //code to go to home page
        home = (ImageView) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage(); //call
            }
        });

        //code to go back to user to-do page
        backArrow = (ImageView) findViewById(R.id.backarrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserToDoList(); //call
            }
        });




    }



    //method to go to home page
    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }
    //method to go back to reminders page
    public void openUserToDoList() {
        Intent intent = new Intent(this, UserToDoList.class);
        startActivity(intent);

    }
}