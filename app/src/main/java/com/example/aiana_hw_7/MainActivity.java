package com.example.aiana_hw_7;

import androidx.appcompat.app.AppCompatActivity;

import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    Integer first, second, result;
    TextView textView;
    boolean isOperationClick;
    VolumeShaper.Operation operation;



    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.zero:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
            case R.id.AC:
                textView.setText("0");
                first = 0;
                second = 0;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.PLUS;
                break;
            case R.id.minus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.MINIS;

                break;
            case R.id.delit:
                operation = Operation.DELIT;

                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.multipli:
                operation = Operation.MULTIPLY;

                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.ravna:
                if (operation == Operation.PLUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first + second;
                    textView.setText(result.toString());
                }
                else if (operation == Operation.MINIS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first - second;
                    textView.setText(result.toString());
                }
                else if (operation == Operation.DELIT) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first/ second;
                    textView.setText(result.toString());
                }
                if (operation == Operation.MULTIPLY) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first * second;
                    textView.setText(result.toString());
                }


                break;
        }
        isOperationClick = true;
    }
}