package com.bella.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormBioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_bio);
    }

    public void biodata(View view){
        EditText name = findViewById(R.id.i_name);
        EditText npm = findViewById(R.id.i_npm);
        String data1 = name.getText().toString();
        String data2 = npm.getText().toString();

        Intent intent = new Intent(this,ViewBioActivity.class);
        intent.putExtra("EXTRA_DATA", data1);
        intent.putExtra("EXTRA_DATA2", data2);
        startActivity(intent);
    }
}