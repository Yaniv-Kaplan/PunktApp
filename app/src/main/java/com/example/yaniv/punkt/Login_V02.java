package com.example.yaniv.punkt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_V02 extends AppCompatActivity {

    Button easter;
    Button reg;
    public static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__v02);
        easter = (Button) findViewById(R.id.EasterEgg);
        reg = (Button) findViewById(R.id.register_p2);

        easter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter >= 6){
                    openActivityEaster();
                }
                else{
                    counter++;
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityRegister();
            }
        });

    }

    public void openActivityEaster(){
        Intent intent = new Intent(this, EasterEgg.class);
        startActivity(intent);
    }

    public void openActivityRegister(){
        Intent intent = new Intent(this, Register_V02_P2.class);
        startActivity(intent);
    }
}
