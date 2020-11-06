package com.bella.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewBioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bio);

        Intent intent = getIntent();

        String name = intent.getStringExtra("EXTRA_DATA");
        String npm = intent.getStringExtra("EXTRA_DATA2");
        TextView textView = findViewById(R.id.tv_name);
        TextView textView2 = findViewById(R.id.tv_npm);
        textView.setText(name);
        textView2.setText(npm);
    }
}