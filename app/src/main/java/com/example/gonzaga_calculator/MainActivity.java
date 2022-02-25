package com.example.gonzaga_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtVar1, txtVar2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo;
    static TextView txtAnswer;

    static double var1;
    static double var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        txtAnswer = findViewById(R.id.answerText);

        //set listeners
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    //methods here
    public static void add() {
        txtAnswer.setText(Double.toString(var1+var2));
    }

    public static void subtract() {
        txtAnswer.setText(Double.toString(var1-var2));
    }

    public static void divide() {
        txtAnswer.setText(Double.toString(var1/var2));
    }

    public static void multiply() {
        txtAnswer.setText(Double.toString(var1*var2));
    }

    public static void modulo() {
        txtAnswer.setText(Double.toString(var1%var2));
    }

    @Override
    public void onClick(View v) {

        txtVar1 = findViewById(R.id.txtVar1);
        txtVar2 = findViewById(R.id.txtVar2);

        var1 = Double.parseDouble(txtVar1.getText().toString());
        var2 = Double.parseDouble(txtVar2.getText().toString());

        //button functionality
        switch(v.getId()){
            case R.id.btnAdd:
                add();
                break;

            case R.id.btnSubtract:
                subtract();
                break;

            case R.id.btnMultiply:
                multiply();
                break;

            case R.id.btnDivide:
                divide();
                break;

            case R.id.btnModulo:
                modulo();
                break;
        }
    }
}