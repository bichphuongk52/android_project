package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeHoaActivity extends AppCompatActivity {

    Button btn_hoa_1;
    Button btn_hoa_2;
    Button btn_hoa_3;
    Button btn_chon_mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_hoa);
        init();
        addListener();
    }
    private void init() {
        btn_hoa_1 = findViewById(R.id.btn_hoa_1);
        btn_hoa_2 = findViewById(R.id.btn_hoa_2);
        btn_hoa_3 = findViewById(R.id.btn_hoa_3);
        btn_chon_mon = findViewById(R.id.btn_chon_mon);
    }

    private void addListener() {
        btn_hoa_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToHoaDe1Activity
            }
        });
        btn_hoa_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToHoaDe2Activity
            }
        });
        btn_hoa_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToHoaDe3Activity
            }
        });
        btn_chon_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChonMonActivity();
            }
        });
    }

    //chọn hóa đề 1
    //chọn hóa đề 2
    //chọn hóa đề 3

    // quay lại chọn môn
    private void goToChonMonActivity() {
        Intent intent = new Intent(DeHoaActivity.this, ChonMonActivity.class);
        startActivity(intent);
    }
}