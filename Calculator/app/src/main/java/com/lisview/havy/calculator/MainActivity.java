package com.lisview.havy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editInput;
    private TextView tvResult;
    private Button btnNumber0;
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMulti;
    private Button btnDiv;
    private Button btnDot;
    private Button btnResult;
    private Button btnClear;
    private Button btnClearall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
    }

    public void initWidgets(){

        btnNumber0 = (Button) findViewById(R.id.id_0);
        btnNumber1 = (Button) findViewById(R.id.id_1);
        btnNumber2 = (Button) findViewById(R.id.id_2);
        btnNumber3 = (Button) findViewById(R.id.id_3);
        btnNumber4 = (Button) findViewById(R.id.id_4);
        btnNumber5 = (Button) findViewById(R.id.id_5);
        btnNumber6 = (Button) findViewById(R.id.id_6);
        btnNumber7 = (Button) findViewById(R.id.id_7);
        btnNumber8 = (Button) findViewById(R.id.id_8);
        btnNumber9 = (Button) findViewById(R.id.id_9);
        btnAdd = (Button) findViewById(R.id.id_add);
        btnSub = (Button) findViewById(R.id.id_sub);
        btnMulti = (Button) findViewById(R.id.id_multi);
        btnDiv = (Button) findViewById(R.id.id_div);
        btnDot = (Button) findViewById(R.id.id_dot);
        btnClear = (Button) findViewById(R.id.id_clear);
        btnClearall = (Button) findViewById(R.id.id_ac);
        btnResult = (Button) findViewById(R.id.id_result);
    }
}
