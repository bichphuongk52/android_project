package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChonMonActivity extends AppCompatActivity {

    Button btn_toan;
    Button btn_ly;
    Button btn_hoa;
    Button btn_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_mon);
        init();
        addListener();
    }
    private void init() {
        btn_toan = findViewById(R.id.btn_toan);
        btn_ly = findViewById(R.id.btn_ly);
        btn_hoa = findViewById(R.id.btn_hoa);
        btn_main = findViewById(R.id.btn_main);
    }
    private void addListener() {
        btn_toan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDeToanActivity();
            }
        });

        btn_ly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gotoDeLyActivity
            }
        });
        btn_hoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gotoDeHoaActivity
            }
        });
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainActivity();
            }
        });
    }

    //chọn đề toán
    private  void gotoDeToanActivity() {
        Intent intent = new Intent(ChonMonActivity.this, DeToanActivity.class);
        startActivity(intent);
    }

    //chọn đề lý
    //chọn đề hóa

    //chọn quay về trang chủ
    private void goToMainActivity() {
        Intent intent = new Intent(ChonMonActivity.this, MainActivity.class);
        startActivity(intent);
    }

}