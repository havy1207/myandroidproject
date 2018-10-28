package com.lisview.havy.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void function_btn(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        switch (view.getId()){

            case R.id.btnA:
                fragment = new fragment_0();
                break;
            case R.id.btnB:
                fragment = new fragment_1();
                break;
        }

        //fragmentTransaction.add(R.id.fragment_user,fragment);// cho 1 fragment
        fragmentTransaction.replace(R.id.fragment_user,fragment);// cho nhieu fragment
        fragmentTransaction.commit();
    }


}
