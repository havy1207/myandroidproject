package com.lisview.havy.intentexplicit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, second_activity.class);
                startActivity(intent);
                // gui kem dat
                intent.putExtra("dulieu", "Noi dung chuoi gui kem");
            }
        });

    }


    public void init (){
        btn = (Button) findViewById(R.id.id_btn);
    }
}
