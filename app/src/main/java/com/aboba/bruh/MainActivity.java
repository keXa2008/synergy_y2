package com.aboba.bruh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        EditText moneyText = findViewById(R.id.money);
        double money = Double.parseDouble(moneyText.getText().toString());

        EditText scholarshipText = findViewById(R.id.scholarship);
        double scholarship = Double.parseDouble(scholarshipText.getText().toString());

        EditText interestText = findViewById(R.id.interest);
        double interest = Double.parseDouble(interestText.getText().toString());

        EditText goalText = findViewById(R.id.goal);
        double goal = Double.parseDouble(goalText.getText().toString());

        Button calcButton = findViewById(R.id.calcButton);

        Calculator calculator = new Calculator(money, scholarship, interest, goal);
        calcButton.setText("Через "+String.valueOf(calculator.calculate())+" месяцев");
    }
}