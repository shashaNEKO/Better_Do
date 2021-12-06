package com.example.better_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class UserReminders extends AppCompatActivity {
    private  ImageView home; //button to go to home page
    private  ImageView add; //button to go to add page
    private ImageButton edit; //button to go to edit page
    private ImageButton delete; //button to delete reminder
    private int counter=0;
    public Reminder[] RemindersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reminders);
         RemindersList = new Reminder[9];
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
                openReminder(); //call
            }
        });


        //code to go to edit page
        edit = (ImageButton) findViewById(R.id.editButton);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReminder(); //call
            }
        });



    }

    //method to go to home page
    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }
    //method to go to add page
    public void openReminder() {
        Intent intent = new Intent(this, Reminder.class);
        startActivity(intent);

    }
    public boolean AddReminder(String ReminderTitle,String Time,boolean Activation){

        if(counter==9)
        return false;
        Reminder r = new Reminder(ReminderTitle,Time,Activation,0);
        if(counter==0){
            RemindersList[0]=r;
            counter++;
            return true;
        }
        for(int i=0;i<9;i++){
            if(RemindersList[i]==null)
                RemindersList[i]=r;}
        counter++;
        return true;
    }
    public boolean deleteReminder(int id){
        for(int i=0;i<counter;i++)
            if(RemindersList[i].getId()==id)
            {
                RemindersList[i]=null;
                counter--;
                return true;
            }

        return false;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}