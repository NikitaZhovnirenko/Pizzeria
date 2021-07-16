package com.example.pizzeria;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
private TextView totalPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView totalPrice = new TextView(this);
        totalPrice.setTextSize(26);
        totalPrice.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            int totalPrice = arguments.getInt("totalPrice");
            totalPrice.setText(
                    "Итого: " + totalPrice);
        }

        setContentView(R.layout.activity_second);

    }




}
