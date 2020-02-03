package com.example.guestaccount.calculatorbyantardeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaration of variables of all buttons and edit text view
    Button one,two,three,four,five,six,seven,eight,nine,zero,point,equal,plus,minus,multiply,divide,clear,sign;
    TextView text;

    //declaration of two variables to hold operand values
    Float operand1, operand2;

    //declaration of boolean variables to keep the status
    boolean flagPlus, flagMinus, flagMultiply, flagDivide;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fetch the view of current activity from layout resource file and asign it to the associated variables
        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        point = (Button)findViewById(R.id.point);
        equal = (Button)findViewById(R.id.equal);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        clear = (Button)findViewById(R.id.clear);
        sign = (Button)findViewById(R.id.sign);
        text = (TextView)findViewById(R.id.text);

        //Linking Listeners to all attributes and the method that should be performed on each click
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //concatinating 0 to current text on EditText View
                text.setText(text.getText() + "0");
            }
        });
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text.setText(text.getText()+"1");
                }
            });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 text.setText(text.getText()+"3");
             }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });



    }
}
