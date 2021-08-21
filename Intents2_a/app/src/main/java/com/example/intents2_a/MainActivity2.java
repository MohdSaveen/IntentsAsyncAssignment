package com.example.intents2_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
TextView text22;
TextView text23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView7);
        text22=findViewById(R.id.textView8);
        text23=findViewById(R.id.textView9);
        Intent intent=getIntent();
        String str= intent.getStringExtra("Fname");
        String str2= intent.getStringExtra("Lname");
        String str3=intent.getStringExtra("age");
        textView.setText(str);
        text22.setText(str2);
        text23.setText(str3);
    }
}