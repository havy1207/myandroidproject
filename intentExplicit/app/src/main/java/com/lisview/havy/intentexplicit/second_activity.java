package com.lisview.havy.intentexplicit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_activity extends AppCompatActivity
{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        // nhan du lieu
        Intent intent = getIntent();
        String noidung = intent.getStringExtra("dulieu");
        textView.setText(noidung);



    }


    public void init (){
        textView = (TextView) findViewById(R.id.id_tv);
    }
}
