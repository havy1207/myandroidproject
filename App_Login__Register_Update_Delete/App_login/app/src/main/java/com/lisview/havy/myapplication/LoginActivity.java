package com.lisview.havy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edt_name, edt_pass;
    Button btn_login;
    Database login_db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        clickLogin();
    }

    public  void init (){
        edt_name = (EditText)findViewById(R.id.edit_tendangnhap_login);
        edt_pass = (EditText)findViewById(R.id.edit_matkhau_login);
        btn_login = (Button) findViewById(R.id.btn_dangnhap_login);
        login_db = new Database(this);
    }

    // Khoi tao ham clickLogon
    public  void clickLogin(){
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = edt_name.getText().toString();
                String passStr = edt_pass.getText().toString();
                if(!nameStr.isEmpty() && !passStr.isEmpty()){

                    Boolean loginSuccess = login_db.findData(nameStr, passStr);
                    if(loginSuccess){
                        Toast.makeText(LoginActivity.this,"Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(LoginActivity.this,"Đăng nhập không thành công", Toast.LENGTH_LONG).show();
                    }
                }
                else {

                    Toast.makeText(LoginActivity.this,"Thất bại không được để trống thông tin", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
