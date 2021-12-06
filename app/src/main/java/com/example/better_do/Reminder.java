package com.example.better_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Reminder extends AppCompatActivity {
    private ImageView home; //button to go to home page
    private ImageView backArrow; //button to go back to reminders page
    private Button doneButton; //button to add/edit reminders then go back to user reminders page
    private EditText reminderTitle;
    private EditText reminderDate;
    private EditText reminderTime;

    private String ReminderTitle;
    private int id;
    private String Time;
    private boolean Activation;

    public Reminder(String ReminderTitle,String Time,boolean Activation,int id) {
        this.Activation=Activation;
        this.reminderTitle=reminderTitle;
        this.Time=Time;
        this.id=id;
    }

    public boolean Edit(int later){return false;}
    public String getReminderTitle() {
        return ReminderTitle;
    }

    public void setReminderTitle(String reminderTitle) {
        ReminderTitle = reminderTitle;
    }

    public boolean isActivation() {
        return Activation;
    }

    public void setActivation(boolean activation) {
        Activation = activation;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        //code to go to home page
        home = (ImageView) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage(); //call
            }
        });

        //code to go back to user reminders page
        backArrow = (ImageView) findViewById(R.id.backarrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserReminders(); //call
            }
        });

        //code to add/edit reminders then go back to user reminders page
        doneButton = (Button) findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserReminders(); //call
            }
        });


        reminderTitle = (EditText) findViewById(R.id.reminderTitle);


    }



    //method to go to home page
    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }
    //method to go back to user reminders page
    public void openUserReminders() {
        Intent intent = new Intent(this, UserReminders.class);
        startActivity(intent);

    }
}