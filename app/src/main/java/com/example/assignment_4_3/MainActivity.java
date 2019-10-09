package com.example.assignment_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    TextView result;
    float rslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        result = (TextView) findViewById(R.id.result);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                rslt = num1 + num2;

                result.setText(String.valueOf(rslt));
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                rslt = num1 - num2;

                result.setText(String.valueOf(rslt));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                rslt = num1 * num2;

                result.setText(String.valueOf(rslt));
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                rslt = num1 / num2;

                result.setText(String.valueOf(rslt));
            }
        });
    }
}
