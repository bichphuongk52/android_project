package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeLyActivity extends AppCompatActivity {

    Button btn_ly_1;
    Button btn_ly_2;
    Button btn_ly_3;
    Button btn_chon_mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_ly);
        init();
        addListener();
    }
    private void init() {
        btn_ly_1 = findViewById(R.id.btn_ly_1);
        btn_ly_2 = findViewById(R.id.btn_ly_2);
        btn_ly_3 = findViewById(R.id.btn_ly_3);
        btn_chon_mon = findViewById(R.id.btn_chon_mon);
    }
    private void addListener() {
        btn_ly_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToLyDe1Activity
            }
        });
        btn_ly_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToLyDe2Activity
            }
        });
        btn_ly_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToLyDe3Activity
            }
        });
        btn_chon_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChonMonActivity();
            }
        });
    }
    //chọn lý đề 1
    //chọn lý đề 2
    //chọn lý đề 3

    //quay lại chọn môn
    private void goToChonMonActivity() {
        Intent intent = new Intent(DeLyActivity.this, ChonMonActivity.class);
        startActivity(intent);
    }
}