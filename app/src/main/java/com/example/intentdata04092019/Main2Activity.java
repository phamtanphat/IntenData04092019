package com.example.intentdata04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //1 : Nhan dang string
//        Intent intent = getIntent();
//        String value = intent.getStringExtra("chuoi");
//        Log.d("BBB",value);
        //2 : Nhan dang array
//        Intent intent = getIntent();
//        String[] arrayName = intent.getStringArrayExtra("arrayname");
//        Log.d("BBB",arrayName.length + "");
        //3 : Nhan dang object
        Intent intent = getIntent();
        Sinhvien sinhvien = (Sinhvien) intent.getSerializableExtra("object");
        Log.d("BBB",sinhvien.getTen());
    }
}
