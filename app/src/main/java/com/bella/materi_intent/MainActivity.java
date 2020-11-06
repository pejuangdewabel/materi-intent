package com.bella.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecondActivity = findViewById(R.id.btnSecond);
        Button btnBioActivity = findViewById(R.id.bio);

        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
            }
        });
        btnBioActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FormBioActivity.class);
                startActivity(intent);
            }
        });
    }

    public void calling(View view){
        String no = "081541212011";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }

    public void siakad(View view){
        String url = "https://siakad.teknokrat.ac.id/";
        Intent bukaSpada = new Intent(Intent.ACTION_VIEW);
        bukaSpada.setData(Uri.parse(url));
        startActivity(bukaSpada);
    }
    public void sendMessage(View view){
        EditText editText = findViewById(R.id.userMessage);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
    public void maps(View view){
        Uri linkpeta = Uri.parse("http://maps.google.com/maps?saddr=-5.3920933,105.2598532&daddr=-5.3823227,105.2556697");
        Intent bukapeta = new Intent(Intent.ACTION_VIEW, linkpeta);
        bukapeta.setPackage("com.google.android.apps.maps");
        startActivity(bukapeta);
    }
}