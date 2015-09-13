package com.marcusberger.appwtihjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

import com.marcusberger.appwtihjava.R;

import java.text.NumberFormat;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 0;

    public void increment(View view) {

        quantity = quantity+1;
        display(quantity);

    }

    public void decrement(View view) {

        quantity = quantity-1;
        display(quantity);

    }

    public void submitOrder(View view) {

        int price = quantity * 5;
        String priceMessage = "Price $: " + price;
        priceMessage = priceMessage + "\nthank you!!";
        displayMessage(priceMessage);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}