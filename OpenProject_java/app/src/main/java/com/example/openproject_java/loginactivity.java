package com.example.openproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginactivity extends AppCompatActivity {

    private EditText et_id,et_pass;
    private Button btn_login,btn_register,btn_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et_id=findViewById(R.id.et_id);
        et_pass=findViewById(R.id.et_pass);

        btn_find=findViewById(R.id.btn_find);
        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),findactivity.class);
                startActivity(intent);
            }
        });

        btn_register=findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),registeractivity.class);
                startActivity(intent);
            }
        });

        btn_login=findViewById(R.id.btn_login);
    }
}