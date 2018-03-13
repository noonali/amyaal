package com.example.q.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CV extends AppCompatActivity {
    EditText name, id,email,DateOfbearth,PhoneNumber,code;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        name = (EditText)findViewById(R.id.name1);
        id= (EditText)findViewById(R.id.id1);
        email = (EditText)findViewById(R.id.email1);
        DateOfbearth = (EditText)findViewById(R.id.date);
        PhoneNumber = (EditText)findViewById(R.id.phone);
        code = (EditText)findViewById(R.id.code1);

        String type = "get";
        backgroundWorker backgroundWorker = new backgroundWorker(this);
        backgroundWorker.execute(type, name,id,email,DateOfbearth,PhoneNumber,code);
    }
    public  void Button1(View v){
        Intent admin =new Intent(CV.this,upload.class);
        startActivity(admin);
    }
    public  void button3(View v){
        Intent cv =new Intent(CV.this,upload.class);
        startActivity(cv);
    }
    public  void button2(View v){
        //Code upload cv
    }
}
