package com.example.yaniv.punkt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EasterEgg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easter_egg);


    }

    @Override
    protected void onStop() {
        super.onStop();
        Login_V02.counter = 0;
    }
}
