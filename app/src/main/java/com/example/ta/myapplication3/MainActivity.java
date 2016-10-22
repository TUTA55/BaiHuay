package com.example.ta.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Park  = (Button) findViewById(R.id.button3);
        Park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Huay h = new Huay();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("funo","เลขท้าย 2 ตัว");
                i.putExtra("parkzan",h.getRandomTwoDigits());
                startActivity(i);
            }

        }
        );
        Button Dream = (Button) findViewById(R.id.button4);
        Dream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Huay h = new Huay();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("funo","เลขท้าย 3 ตัว");
                i.putExtra("parkzan",h.getRandomThreeDigits());
                startActivity(i);
            }
        });
    }
}

