package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_chon_mon;
    Button btn_xem_diem;
    LinearLayout img_background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListener();
    }
    private void init() {
        btn_chon_mon = findViewById(R.id.btn_chon_mon);
        btn_xem_diem = findViewById(R.id.btn_xem_diem);
        img_background = (LinearLayout) findViewById(R.id.img_background);

        img_background.setBackgroundResource(R.drawable.background);
    }

    private void addListener() {
        btn_chon_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChonMonActivity();
            }
        });
    }
    private void goToChonMonActivity() {
        Intent intent = new Intent(MainActivity.this, ChonMonActivity.class);
        startActivity(intent);
    }
}