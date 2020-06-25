package com.example.openproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registeractivity extends AppCompatActivity {
    EditText user_id, user_pw, user_name,user_phone;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        user_id = (EditText)findViewById(R.id.et_id);
        user_pw = (EditText)findViewById(R.id.et_pass);
        user_name = (EditText)findViewById(R.id.et_name);
        user_phone = (EditText)findViewById(R.id.et_phone);

        registerBtn = (Button)findViewById(R.id.btn_register);

        registerBtn.setOnClickListener(new Button.OnClickListener(){
            //2018038092 안준
            public void onClick(View v){
                String id = user_id.getText().toString();
                String pw = user_pw.getText().toString();
                String name = user_name.getText().toString();
                String phone = user_phone.getText().toString();

                User user = new User(name, pw,phone);

                DatabaseControl database = new DatabaseControl();
                database.writeNewUser(id, user);
                Intent intent = new Intent(getApplicationContext(),loginactivity.class);
                startActivity(intent);
            }
        });
    }
}