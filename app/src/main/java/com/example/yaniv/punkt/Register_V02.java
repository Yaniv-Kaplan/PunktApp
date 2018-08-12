package com.example.yaniv.punkt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_V02 extends AppCompatActivity {

    Button cont_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__v02);

        cont_name = (Button) findViewById(R.id.cont_name);
        cont_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRegisterActivity();
            }
        });

    }

    public void startRegisterActivity(){
        Intent intent = new Intent(this, Register_V02_P2.class);
        startActivity(intent);
    }
}
