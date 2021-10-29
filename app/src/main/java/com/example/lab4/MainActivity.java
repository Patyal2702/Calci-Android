package com.example.lab4;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText number;
    Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,mul,div,clear,equal;
    char operator;
    int val1 , val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number  = findViewById(R.id.number);
        zero    = findViewById(R.id.zero);
        one     = findViewById(R.id.one);
        two     = findViewById(R.id.two);
        three   = findViewById(R.id.three);
        four    = findViewById(R.id.four);
        five    = findViewById(R.id.five);
        six     = findViewById(R.id.six);
        seven   = findViewById(R.id.seven);
        eight   = findViewById(R.id.eight);
        nine    = findViewById(R.id.nine);
        clear   = findViewById(R.id.clear);
        equal   = findViewById(R.id.equal);
        add     = findViewById(R.id.add);
        sub     = findViewById(R.id.sub);
        mul     = findViewById(R.id.mul);
        div     = findViewById(R.id.divide);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText()+"9");
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number != null) {
                     val1 = Integer.parseInt(number.getText().toString());
                    operator = '+';
                }
                number.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number != null) {
                     val1 = Integer.parseInt(number.getText().toString());
                    operator = '-';
                }
                number.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number != null) {
                     val1 = Integer.parseInt(number.getText().toString());
                    operator = '*';
                }
                number.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number != null) {
                     val1 = Integer.parseInt(number.getText().toString());
                    operator = '/';
                }
                number.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                 val2 = Integer.parseInt(number.getText().toString());

                if(operator=='+'){
                    number.setText(val1+val2+"");
                }else if(operator =='-'){
                    number.setText(val1-val2+"");
                }else if(operator=='*'){
                    number.setText(val1*val2+"");
                }else if(operator=='/'){
                    number.setText(val1/val2+"");
                }else{
                    number.setText("select operator please");
                }

            }
        });

        
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(" ");
            }
        });


    }
}