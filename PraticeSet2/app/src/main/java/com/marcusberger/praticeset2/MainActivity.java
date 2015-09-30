package com.marcusberger.praticeset2;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int healthLevel;
    String message;
    public void yes(View view) {
        healthLevel = healthLevel + 1;
        message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        message = "You answered no, current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel = healthLevel + 0;
        message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    public void display(String message) {
        TextView m = (TextView) findViewById(R.id.yes);
        m.setText(message);
    }
}

    
   