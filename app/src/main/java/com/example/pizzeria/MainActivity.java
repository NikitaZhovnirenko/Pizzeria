package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pizzeria.util.Settings;


//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public class MainActivity extends AppCompatActivity {
    private Button btnFirst;
    private Button btnSecond;
    private TextView resultField;
    private TextView resultField2;
    private Button btnThird;
    private TextView tvFinish;
    private int carbonaraCount;
    private int francheskaCount;
    private double totalPrice;
    public static final String KEY_MESSAGE = "com.example.listenersintent.MainActivity.MESSAGE";
    public static final String KEY_SETTINGS = "com.example.listenersintent.MainActivity.SETTINGS";
    private Settings settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();
        getSettings();



    }

    private void getSettings() {
        settings = new Settings(18, "Green", true);
    }

    private void initView() {
        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        btnThird = findViewById(R.id.btnThird);

    }

    private void setListener() {
        btnFirst.setOnClickListener(this::addCarbonara);
        btnSecond.setOnClickListener(this::addFrancheska);
        btnThird.setOnClickListener(this::startSecondActivity);
    }

    private void addCarbonara(View view) {
        totalPrice += 2;
        carbonaraCount += 1;
        resultField.setText(carbonaraCount);

    }
    private void addFrancheska(View view)
    {
        totalPrice += 2.5;
        francheskaCount += 1;
        resultField2.setText(francheskaCount);
    }

    private void startSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("totalPrice", totalPrice);
    }

    private void changeColor(View view) {
        Toast.makeText(MainActivity.this, R.string.say_hello, Toast.LENGTH_SHORT).show();
        tvFinish.setTextColor(getResources().getColor(R.color.red));
    }
}


