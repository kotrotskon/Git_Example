package com.example.git_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button btn_kostas = findViewById(R.id.btn_kostas);
        Button btn_gianna = findViewById(R.id.btn_gianna);
        Button btn_keti = findViewById(R.id.btn_keti);
        Button btn_geoxan = findViewById(R.id.btn_geoxan);

        btn_kostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Kostas");
            }
        });

        btn_gianna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Gianna");
            }
        });

        btn_keti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Keti");
            }
        });

        btn_geoxan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("GeoXan");
            }
        });

    }
}