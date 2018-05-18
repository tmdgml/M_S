package com.example.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    int check = 0; //false
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button add_thing = (Button) findViewById(R.id.button10);
        Button do_round = (Button) findViewById(R.id.button9);
        Button calculate = (Button) findViewById(R.id.button8);
        Button print_thing = (Button) findViewById(R.id.button7);

        add_thing.setText("변수 추가");
        do_round.setText("반복문");
        calculate.setText("사칙연산");
        print_thing.setText("입출력");

        Button compile_this=(Button)findViewById(R.id.button11);
        Button finish_modify=(Button)findViewById(R.id.button12);
        compile_this.setText("Compile");
        finish_modify.setText("FINISH");

        compile_this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check compile this
                check = 1;
                Toast.makeText(getApplicationContext(),"Comile Finish",Toast.LENGTH_SHORT).show();
                //수정 버튼 누르면 다시 0으로 고쳐줘야함
            }
        });

        finish_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check==1){
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Comile please",Toast.LENGTH_SHORT).show();
                }
            }
        });

        final String[] thing_list={"폭탄","괴물","등등"};
        add_thing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Main3Activity.this).setTitle("추가할 변수를 선택해주세요")
                        .setItems(thing_list, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),thing_list[which],Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("",null).show();
            }
        });
    }
}
