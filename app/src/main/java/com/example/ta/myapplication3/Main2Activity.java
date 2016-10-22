package com.example.ta.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent a = getIntent();
        String z = a.getStringExtra("funo");
        TextView w = (TextView)findViewById(R.id.textView3);
        w.setText(z);
        String x = a.getStringExtra("parkzan");
        TextView y = (TextView)findViewById(R.id.rung);
        y.setText(x);
    }
}
