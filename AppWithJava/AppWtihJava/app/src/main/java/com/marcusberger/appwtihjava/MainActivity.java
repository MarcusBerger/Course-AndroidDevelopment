package com.marcusberger.appwtihjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.marcusberger.appwtihjava.R;

import java.text.NumberFormat;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {

        String gerarMessage = "Frase";
        gerarMessage = gerarMessage;
        displayMessage(gerarMessage);
        TextView Frase = (TextView) findViewById(
                R.id.Frase);
    }

    private void displayMessage(String message) {
        TextView gerarFrase = (TextView) findViewById(R.id.Frase);
        gerarFrase.setText(message);
    }

}