package com.example.projecthelloondo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Insert;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class onePage extends AppCompatActivity {
    private String nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_page);

        Intent intent = getIntent();
        nickname = intent.getStringExtra("nickname");

        TextView kakaonick = findViewById(R.id.kakaoNickname);
        kakaonick.setText(nickname);
    }
}