package com.lisview.havy.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView Text_number;
    Button button_random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text_number = (TextView) findViewById(R.id.id_number);
        button_random = (Button) findViewById(R.id.id_button);

        button_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // random
                Random Rnumber = new Random();
                int iNum = Rnumber.nextInt(1000);
                Text_number.setText(iNum + "");
            }
        });
    }
}
