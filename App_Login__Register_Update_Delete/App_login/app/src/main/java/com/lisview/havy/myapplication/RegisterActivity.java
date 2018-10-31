package com.lisview.havy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText edt_name, edt_pass, edt_pass2;
    Button btn_reg;
    Database reg_db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        click_DangKy();
    }

    public  void init (){
        edt_name = (EditText)findViewById(R.id.edit_dangnhap_reg);
        edt_pass = (EditText)findViewById(R.id.edit_matkhau_reg);
        edt_pass2 = (EditText)findViewById(R.id.edit_matkhau_reg2);
        btn_reg = (Button) findViewById(R.id.btn_reg_reg);
        reg_db = new Database(this);
    }

    // Click Dang ky thanh vien
    public void click_DangKy(){
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = edt_name.getText().toString();
                String passString = edt_pass.getText().toString();
                String pass2String = edt_pass2.getText().toString();
                if(!nameString.isEmpty() && !passString.isEmpty() && !pass2String.isEmpty()){
                    if(passString.equals(pass2String)){

                        Boolean btn_regSuccess = reg_db.addData(nameString,pass2String);
                        if(btn_regSuccess){
                            Toast.makeText(RegisterActivity.this,"Đăng Ký Thành Công", Toast.LENGTH_LONG).show();
                            finish();
                        }else{
                            Toast.makeText(RegisterActivity.this,"Đăng Ký KHÔNG Thành Công", Toast.LENGTH_LONG).show();
                            edt_name.setText("");
                            edt_pass.setText("");
                            edt_pass2.setText("");
                        }

                    }
                    else {
                        Toast.makeText(RegisterActivity.this,"Mật khẩu không trùng khớp", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(RegisterActivity.this,"Hãy nhập đầy đủ thông tin", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
