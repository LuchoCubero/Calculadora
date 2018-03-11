package com.example.luisignaciocubero.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        final Button button0 = findViewById(R.id.button17); //Boton del cero.
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("0");
            }
        });

        final Button button1 = findViewById(R.id.button13); //Boton del uno.
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("1");
            }
        });

        final Button button2 = findViewById(R.id.button14); //Boton del dos.
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("2");
            }
        });

        final Button button3 = findViewById(R.id.button15); //Boton del tres.
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("3");
            }
        });

        final Button button4 = findViewById(R.id.button9); //Boton del cuatro.
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("4");
            }
        });

        final Button button5 = findViewById(R.id.button10); //Boton del cinco.
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("5");
            }
        });

        final Button button6 = findViewById(R.id.button11); //Boton del seis.
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("6");
            }
        });

        final Button button7 = findViewById(R.id.button5); //Boton del siete.
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("7");
            }
        });

        final Button button8 = findViewById(R.id.button6); //Boton del ocho.
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("8");
            }
        });

        final Button button9 = findViewById(R.id.button7); //Boton del nueve.
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBox = findViewById(R.id.editText2);
                textBox.getText().append("9");
            }
        });
    }


}
