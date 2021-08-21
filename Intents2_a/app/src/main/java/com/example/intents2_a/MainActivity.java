package com.example.intents2_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText text1;
 EditText text2;
 EditText text3;
 Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.et1);
        text2=findViewById(R.id.et2);
        text3=findViewById(R.id.et3);
        button1=findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text11=text1.getText().toString();
                String text12=text2.getText().toString();
                String text13=text3.getText().toString();

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Fname",text11);
                intent.putExtra("Lname",text12);
                intent.putExtra("age",text13);
                startActivity(intent);
            }
        });

    }
}