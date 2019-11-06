package com.example.intentdata04092019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentArray,btnIntentObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentArray = findViewById(R.id.buttonIntentArray);
        btnIntentObject = findViewById(R.id.buttonIntentObject);

        btnIntentString.setOnClickListener( v -> {
            sendDataByIntent("chuoi","hello main2");
        });
        btnIntentArray.setOnClickListener(v -> {
            String[] arrayName = {"Teo","Ti","Tun","Hoa","Hue","Lan"};
            sendDataByIntent("arrayname",arrayName);
        });
        btnIntentObject.setOnClickListener(v -> {
            Sinhvien sinhvien = new Sinhvien("Nguyen Van A",20);
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("object", (Serializable) sinhvien);
            startActivity(intent);
        });

    }
    public <T extends Serializable> void sendDataByIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra(key,value);
        startActivity(intent);
    }


}
