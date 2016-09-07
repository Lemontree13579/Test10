package com.example.user.test10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class AnotherActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        String num = intent.getStringExtra("模特姓名");
        String name = intent.getStringExtra("三围");
        Toast.makeText(this, "模特姓名：" + num +"  三围:" + name,Toast.LENGTH_LONG).show();


    }


}
