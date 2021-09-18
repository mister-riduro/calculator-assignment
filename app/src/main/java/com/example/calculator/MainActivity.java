package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    String process;

    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnErase;
    Button btnDivide;
    Button btnPlus;
    Button btnMin;
    Button btnReset;
    Button btnMultiple;
    Button btnEqual;
    Button btnMod;
    Button btnDot;
    Button btnZeroThree;

    TextView txtInput;
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero = findViewById(R.id.btn0);
        btnOne = findViewById(R.id.btn1);
        btnTwo = findViewById(R.id.btn2);
        btnThree = findViewById(R.id.btn3);
        btnFour = findViewById(R.id.btn4);
        btnFive = findViewById(R.id.btn5);
        btnSix = findViewById(R.id.btn6);
        btnSeven = findViewById(R.id.btn7);
        btnEight = findViewById(R.id.btn8);
        btnNine = findViewById(R.id.btn9);
        btnEqual = findViewById(R.id.btnEqual);
        btnReset = findViewById(R.id.btnReset);
        btnMod = findViewById(R.id.btnMod);
        btnMin = findViewById(R.id.btnMin);
        btnMultiple = findViewById(R.id.btnMultiply);
        btnErase = findViewById(R.id.btnErase);
        btnDivide = findViewById(R.id.btnDivide);
        btnPlus = findViewById(R.id.btnPlus);
        btnDot = findViewById(R.id.btnDot);
        btnZeroThree = findViewById(R.id.btn03);

        txtInput = findViewById(R.id.txtInput);
        txtOutput = findViewById(R.id.txtOutput);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText("");
                txtOutput.setText("");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "9");
            }
        });

        btnZeroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "000");
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "x");
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "%");
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "-");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "+");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + ".");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "/");
            }
        });

        btnErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = txtInput.getText().toString();
                txtInput.setText(process + "8");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate(txtInput, txtOutput);
            }
        });
    }

    public void evaluate(TextView txtInput, TextView txtOutput) {
        String splitNumber;
        String[] split;
        String oprtr;
        double result;
        double num;

        splitNumber = txtInput.getText().toString();
        split = splitNumber.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        LinkedList<Double> number = new LinkedList<>();
        LinkedList<String> operator = new LinkedList<>();

        for(int i=0; i<split.length; i++) {
            if(split[i].equals("+") || split[i].equals("-") || split[i].equals("/")
                    || split[i].equals("x") || split[i].equals("%")) {
                        operator.add(split[i]);
            } else {
                number.add(Double.parseDouble(split[i]));
            }
        }

        for(int j=0; j<operator.size();j++) {
            String operators = operator.get(j);

            if(operators.equals("x") || operators.equals("/") || operators.equals("%")) {
                switch (operators) {
                    case "x":
                         number.set(j, number.get(j) * number.get(j+1));
                         number.remove(j + 1);
                         operator.remove(j);
                         break;

                    case "/":
                        number.set(j, number.get(j) / number.get(j+1));
                        number.remove(j + 1);
                        operator.remove(j);
                        break;

                    case "%":
                        number.set(j, number.get(j) % number.get(j+1));
                        number.remove(j + 1);
                        operator.remove(j);
                        break;
                }
            }
        }

        result = number.poll();
        while (!operator.isEmpty()) {
            oprtr = operator.poll();
            num = number.poll();

            switch (oprtr) {
                case "+":
                    result =+ num;
                    break;

                case "-":
                    result =- num;
                    break;
            }
        }

        txtOutput.setText(Double.toString(result));
    }
}