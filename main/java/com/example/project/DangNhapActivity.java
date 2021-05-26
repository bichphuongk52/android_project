package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class DangNhapActivity extends AppCompatActivity {

    Button btn_login;
    Button btn_sigup;
    LinearLayout img_background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        init();
        addListener();
    }
    private void init() {
        btn_sigup = findViewById(R.id.btn_sigup);
        btn_login = findViewById(R.id.btn_login);
        img_background = (LinearLayout) findViewById(R.id.img_background);

        img_background.setBackgroundResource(R.drawable.background);
    }

    private void addListener() {

    }
}