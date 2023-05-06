package com.example.projecthelloondo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class qPage extends AppCompatActivity {
    private String kakaoid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qpage);

        Intent intent = getIntent();
        kakaoid = intent.getStringExtra("id");
        TextView getid = findViewById(R.id.getid);
        getid.setText(kakaoid);
        //지금은 레이아웃 구분을 위해 카카오id로 해놓음 마지막에 닉네임으로 변경


        






    }
}