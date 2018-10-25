package com.lisview.havy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        setEventClickViews();
    }
    // tim id
    public void initWidgets(){
        editInput = (EditText) findViewById(R.id.id_input);
        tvResult = (TextView) findViewById(R.id.id_tvresult);
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
    // Bat su kien
    public void setEventClickViews() {
        btnNumber0.setOnClickListener(this);
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnDot.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearall.setOnClickListener(this);
        btnResult.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_0:
                //TO DO
                editInput.append("0");
                break;
            case R.id.id_1:
                //TO DO
                editInput.append("1");
                break;
            case R.id.id_2:
                //TO DO
                editInput.append("2");
                break;
            case R.id.id_3:
                editInput.append("3");
                //TO DO
                break;
            case R.id.id_4:
                //TO DO
                editInput.append("4");
                break;
            case R.id.id_5:
                //TO DO
                editInput.append("5");
                break;
            case R.id.id_6:
                //TO DO
                editInput.append("6");
                break;
            case R.id.id_7:
                //TO DO
                editInput.append("7");
                break;
            case R.id.id_8:
                //TO DO
                editInput.append("8");
                break;
            case R.id.id_9:
                //TO DO
                editInput.append("9");
                break;
            case R.id.id_add:
                //TO DO
                editInput.append("+");
                break;
            case R.id.id_sub:
                //TO DO
                editInput.append("-");
                break;
            case R.id.id_multi:
                //TO DO
                editInput.append("*");
                break;
            case R.id.id_div:
                //TO DO
                editInput.append("/");
                break;

            case R.id.id_dot:
                //TO DO
                editInput.append(".");
                break;
            case R.id.id_clear:
                //TO DO
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(editInput, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.id_ac:
                //TO DO
                editInput.setText("");
                tvResult.setText("");

                break;
            case R.id.id_result:
                //To do
                //To do
                DecimalFormat df = new DecimalFormat("###.#######");
                double result = 0;
                addOperation(editInput.getText().toString());
                addNumber(editInput.getText().toString());
                // Thuật toán tính toán biểu thức
                if(arrOperation.size()>=arrNumber.size() ||arrOperation.size()<1){
                    tvResult.setText("Lỗi định dạng");
                }else {
                    for (int i = 0; i < (arrNumber.size() - 1); i++) {
                        switch (arrOperation.get(i)) {
                            case "+":
                                if (i == 0) {
                                    result = arrNumber.get(i) + arrNumber.get(i + 1);
                                } else {
                                    result = result + arrNumber.get(i + 1);
                                }
                                break;
                            case "-":
                                if (i == 0) {
                                    result = arrNumber.get(i) - arrNumber.get(i + 1);
                                } else {
                                    result = result - arrNumber.get(i + 1);
                                }
                                break;
                            case "*":
                                if (i == 0) {
                                    result = arrNumber.get(i) * arrNumber.get(i + 1);
                                } else {
                                    result = result * arrNumber.get(i + 1);
                                }
                                break;
                            case "/":
                                if (i == 0) {
                                    result = arrNumber.get(i) / arrNumber.get(i + 1);
                                } else {
                                    result = result / arrNumber.get(i + 1);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    tvResult.setText(df.format(result) + "");
                }
        }
    }

    //Mảng chứa các phép tính +, - , x, /
    public ArrayList<String> arrOperation;
    //Mảng chứa các số
    public ArrayList<Double> arrNumber;
    //Lấy tất cả các phép tính lưu vào mảng arrOperation
    public int addOperation(String input) {
        arrOperation = new ArrayList<>();

        char[] cArray = input.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            switch (cArray[i]) {
                case '+':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '-':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '*':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '/':
                    arrOperation.add(cArray[i] + "");
                    break;
                default:
                    break;
            }
        }
        return 0;
    }
    //Lấy tất cả các số lưu vào mảng arrNumber
    public void addNumber(String stringInput) {
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringInput);
        while(matcher.find()){
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }
}
