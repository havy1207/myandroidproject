package com.lisview.havy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, reg, update, delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        clickDelete();
        clickLogin();
        clickRegister();
        clickUpdate();
    }

    public void init(){

        login = (Button) findViewById(R.id.login_main);
        update = (Button) findViewById(R.id.update_main);
        reg = (Button) findViewById(R.id.reg_main);
        delete = (Button) findViewById(R.id.delete_main);
    }

    // Ham login
    public void clickLogin(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
    // Ham Delete
    public void clickDelete(){
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DeleteActivity.class));
            }
        });
    }
    // Ham Register
    public void clickRegister(){
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }
    // Ham Update
    public void clickUpdate(){
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UpdateActivity.class));
            }
        });
    }
}
