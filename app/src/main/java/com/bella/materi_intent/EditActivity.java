package com.bella.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.displayId);
        textView.setText(message);
    }
}