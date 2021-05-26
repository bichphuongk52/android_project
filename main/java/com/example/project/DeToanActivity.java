package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeToanActivity extends AppCompatActivity {

    Button btn_toan_1;
    Button btn_toan_2;
    Button btn_toan_3;
    Button btn_chon_mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_toan);
        init();
        addListener();
    }
    private void init() {
        btn_toan_1 = findViewById(R.id.btn_toan_1);
        btn_toan_2 = findViewById(R.id.btn_toan_2);
        btn_toan_3 = findViewById(R.id.btn_toan_3);
        btn_chon_mon = findViewById(R.id.btn_chon_mon);
    }

    private void addListener() {
        btn_toan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToToanDe1Activity
            }
        });
        btn_toan_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToToanDe2Activity
            }
        });
        btn_toan_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToToanDe3Activity
            }
        });

        btn_chon_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChonMonActivity();
            }
        });
    }

    //chọn toán đề 1
    //chọn toán đề 2
    //chọn toán đề 3

    //quay lại chọn môn
    private void goToChonMonActivity() {
        Intent intent = new Intent(DeToanActivity.this, ChonMonActivity.class);
        startActivity(intent);
    }
}