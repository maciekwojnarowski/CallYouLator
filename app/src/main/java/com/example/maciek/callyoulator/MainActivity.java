package com.example.maciek.callyoulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView screen;
    float num1;
    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.textView);

        final Button button1b = (Button) findViewById(R.id.button1);
        button1b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button1b.getText().toString()));

            }

        });

        final Button button2b = (Button) findViewById(R.id.button2);
        button2b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button2b.getText().toString()));

            }

        });

        final Button button3b = (Button) findViewById(R.id.button3);
        button3b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button3b.getText().toString()));

            }

        });

        final Button button4b = (Button) findViewById(R.id.button4);
        button4b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button4b.getText().toString()));

            }

        });

        final Button button5b = (Button) findViewById(R.id.button5);
        button5b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button5b.getText().toString()));

            }

        });

        final Button button6b = (Button) findViewById(R.id.button6);
        button6b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button6b.getText().toString()));

            }

        });

        final Button button7b = (Button) findViewById(R.id.button7);
        button7b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button7b.getText().toString()));

            }

        });

        final Button button8b = (Button) findViewById(R.id.button8);
        button8b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button8b.getText().toString()));

            }

        });

        final Button button9b = (Button) findViewById(R.id.button9);
        button9b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button9b.getText().toString()));

            }

        });

        final Button button0b = (Button) findViewById(R.id.button0);
        button0b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (button0b.getText().toString()));

            }

        });

        final Button buttonkrop = (Button) findViewById(R.id.buttonkrop);
        buttonkrop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                screen.setText((screen.getText().toString()) + (buttonkrop.getText().toString()));

            }

        });


        final Button buttonc = (Button) findViewById(R.id.button10);
        buttonc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String current = screen.getText().toString();
                if  (current.isEmpty())
                    screen.setText(current);
                else
                    screen.setText(current.substring(0, current.length()-1));
            }

        });

        final Button buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(screen.getText().toString());
                operator=1;
                screen.setText("");
            }

        });

        final Button buttonmin = (Button) findViewById(R.id.buttonmin);
        buttonmin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(screen.getText().toString());
                operator=2;
                screen.setText("");
            }

        });

        final Button buttonmn = (Button) findViewById(R.id.buttonmn);
        buttonmn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(screen.getText().toString());
                operator=3;
                screen.setText("");
            }

        });

        final Button buttondzie = (Button) findViewById(R.id.buttondzie);
        buttondzie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(screen.getText().toString());
                operator=4;
                screen.setText("");
            }

        });

        final Button buttonr = (Button) findViewById(R.id.buttonr);
        buttonr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                float num2 = Float.parseFloat(screen.getText().toString());
                float res = 0;

                if(operator == 1){
                    res = num1 + num2;
                }
                if(operator == 2){
                    res = num1 - num2;
                }
                if(operator == 3){
                    res = num1 * num2;
                }
                if(operator == 4){
                    res = num1 / num2;
                }

                screen.setText(String.valueOf(res));


            }

        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("operator", operator);
        outState.putFloat("num1", num1);
        outState.putString("screen", screen.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        operator = savedInstanceState.getInt("operator");
        num1 = savedInstanceState.getFloat("num1");
        screen.setText(savedInstanceState.getString("screen"));
    }
}

