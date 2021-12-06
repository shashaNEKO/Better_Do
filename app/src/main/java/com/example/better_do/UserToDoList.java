package com.example.better_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UserToDoList extends AppCompatActivity {
    private ImageView home; //button to go to home page
    private  ImageView add; //button to go to add page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_to_do_list);


        //code to go to home page
        home = (ImageView) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage(); //call
            }
        });


        //code to go to add page
        add = (ImageView) findViewById(R.id.addButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openToDoPage(); //call
            }
        });
    }

    //method to go to home page
    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }

    //method to go to add page
    public void openToDoPage() {
        Intent intent = new Intent(this, ToDo.class);
        startActivity(intent);

    }
}