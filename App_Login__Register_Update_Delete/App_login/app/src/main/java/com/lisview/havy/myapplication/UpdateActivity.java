package com.lisview.havy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateActivity extends AppCompatActivity {

    Button btn_changpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        btn_changpass = (Button)findViewById(R.id.btn_capnhat_update);
        click_btn_capnhat();
    }

    public void click_btn_capnhat(){
        btn_changpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UpdateActivity.this, ChangePassActivity.class));
            }
        });
    }
}
