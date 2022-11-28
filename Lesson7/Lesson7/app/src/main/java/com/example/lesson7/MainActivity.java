package com.example.lesson7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Integer firstValue = 0;
    private Integer secondValue = 0;
    private Integer result = 0;
    private TextView tvResult;
    private Button btnOne, btnTwo, btnPlus, btnEqual, btnClear;
    private boolean onCheckFirstValue = true;
    private boolean operation = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnPlus = findViewById(R.id.btn_plus);
        btnEqual = findViewById(R.id.btn_equal);
        btnClear = findViewById(R.id.btn_clear);
        calculatedNew();
    }

    @SuppressLint("SetTextI18n")
    public void calculatedNew() {
        btnOne.setOnClickListener(v -> {
            if (onCheckFirstValue) {
                if (firstValue.equals(0)) firstValue = 1;
                else firstValue = Integer.valueOf(firstValue + "1");
                tvResult.setText(firstValue.toString());
            } else {
                if (secondValue.equals(0)) secondValue = 1;
                else secondValue = Integer.valueOf(secondValue + "1");
                tvResult.setText(secondValue.toString());
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 2;
                    else firstValue = Integer.valueOf(firstValue + "2");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 2;
                    else secondValue = Integer.valueOf(secondValue + "2");
                    tvResult.setText(secondValue.toString());
                }
            }
        });

        btnPlus.setOnClickListener(v -> {
            operation = true;
            onCheckFirstValue = false;
        });

        btnClear.setOnClickListener(v -> {
            firstValue = 0;
            secondValue = 0;
            tvResult.setText("0");
            result = 0;
        });

        btnEqual.setOnClickListener(v -> {
            if (operation) {
                result = firstValue + secondValue;
                operation = false;
            }
            tvResult.setText(result.toString());
            firstValue = 0;
            secondValue = 0;
            result = 0;
            onCheckFirstValue = true;
        });
    }
}