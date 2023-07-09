package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button abrirLanches, abrirBebidas, abrirDoces;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abrirLanches = findViewById(R.id.buttonLanches);

        abrirLanches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanches = new Intent(getApplicationContext(), lanches.class);
                startActivity(lanches);
            }
        });

        abrirBebidas = findViewById(R.id.buttonBebidas);

        abrirBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bebidas = new Intent(getApplicationContext(), Bebidas.class);
                startActivity(bebidas);
            }
        });

        abrirDoces = findViewById(R.id.buttonDoces);

        abrirDoces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doces = new Intent(getApplicationContext(), Doces.class);
                startActivity(doces);
            }
        });
    }
}