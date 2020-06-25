package com.example.openproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainpageactivity extends AppCompatActivity {

    private EditText et_legion,et_text;
    private Button btn_mypage,btn_tree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        btn_mypage=findViewById(R.id.mypage);
        btn_mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),findactivity.class);
                startActivity(intent);
            }
        });

        btn_tree=findViewById(R.id.tree);
        btn_tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),treeactivity.class);
                startActivity(intent);
            }
        });
    }
}