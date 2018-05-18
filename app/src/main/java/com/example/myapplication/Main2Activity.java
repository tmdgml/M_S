package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button modify_button = (Button)findViewById(R.id.button5);
        Button start_button = (Button)findViewById(R.id.button6);
        Button left_button = (Button)findViewById(R.id.button3);
        Button right_button = (Button)findViewById(R.id.button4);
        final ImageView plane =(ImageView)findViewById(R.id.imageView2);

        modify_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        left_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plane.offsetLeftAndRight(-20);// move left
            }
        });
        right_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plane.offsetLeftAndRight(20);
            }
        });

    }
}
