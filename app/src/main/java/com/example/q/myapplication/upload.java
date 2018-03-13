package com.example.q.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class upload extends AppCompatActivity {
    EditText name, id,email,DateOfbearth,PhoneNumber,code;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        name = (EditText)findViewById(R.id.name1);
        id= (EditText)findViewById(R.id.id1);
        email = (EditText)findViewById(R.id.email1);
        DateOfbearth = (EditText)findViewById(R.id.date);
        PhoneNumber = (EditText)findViewById(R.id.phone);
        code = (EditText)findViewById(R.id.code1);

    }
    public  void Button2(View v){
        //Code upload cv
    }
    public  void button3(View v){
        Intent cv =new Intent(upload.this,CV.class);
        startActivity(cv);
    }
}
