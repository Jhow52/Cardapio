package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Doces extends AppCompatActivity {

    Button voltarInicio;
    Button aumentarP, aumentarB, aumentarM;
    Button diminuirP, diminuirB, diminuirM;
    Button irPraFinalizarPedido;
    TextView mostrarQuantidadeP, mostrarQuantidadeB, mostrarQuantidadeM;
    Double precoP = 8.00;
    Double precoB = 6.00;
    Double precoM = 10.50;
    public int quantidadeProdutosP = 0, quantidadeProdutosB = 0, quantidadeProdutosM;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doces);

        //Pudim

        voltarInicio = findViewById(R.id.docesVoltarInicio);
        aumentarP = findViewById(R.id.aumentarQuantidade6);
        diminuirP = findViewById(R.id.diminuirQuantidade6);
        mostrarQuantidadeP = findViewById(R.id.quantidadeView6);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoDoces);

        aumentarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosP++;
                mostrarQuantidadeP.setText(String.valueOf(quantidadeProdutosP));
            }
        });

        diminuirP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosP == 0 ){

                }
                else{
                    quantidadeProdutosP = quantidadeProdutosP -1;
                }
                mostrarQuantidadeP.setText(String.valueOf(quantidadeProdutosP));
            }
        });

        //Bolinho

        voltarInicio = findViewById(R.id.docesVoltarInicio);
        aumentarB = findViewById(R.id.aumentarQuantidade9);
        diminuirB = findViewById(R.id.diminuirQuantidade9);
        mostrarQuantidadeB = findViewById(R.id.quantidadeView9);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoDoces);

        aumentarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosB++;
                mostrarQuantidadeB.setText(String.valueOf(quantidadeProdutosB));
            }
        });

        diminuirB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosB == 0 ){

                }
                else{
                    quantidadeProdutosB = quantidadeProdutosB -1;
                }
                mostrarQuantidadeB.setText(String.valueOf(quantidadeProdutosB));
            }
        });

        //Milk Shake

        voltarInicio = findViewById(R.id.docesVoltarInicio);
        aumentarM = findViewById(R.id.aumentarQuantidade10);
        diminuirM = findViewById(R.id.diminuirQuantidade10);
        mostrarQuantidadeM = findViewById(R.id.quantidadeView10);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoDoces);

        aumentarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosM++;
                mostrarQuantidadeM.setText(String.valueOf(quantidadeProdutosM));
            }
        });

        diminuirM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosM == 0 ){

                }
                else{
                    quantidadeProdutosM = quantidadeProdutosM -1;
                }
                mostrarQuantidadeM.setText(String.valueOf(quantidadeProdutosM));
            }
        });

        irPraFinalizarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosP > 0 || quantidadeProdutosB > 0 || quantidadeProdutosM > 0){
                    Intent finalizar = new Intent(Doces.this, finalizarpedido.class);
                    finalizar.putExtra("quantidadeProdutosP", quantidadeProdutosP);
                    finalizar.putExtra("quantidadeProdutosB", quantidadeProdutosB);
                    finalizar.putExtra("quantidadeProdutosM", quantidadeProdutosM);
                    finalizar.putExtra("precoP", precoP);
                    finalizar.putExtra("precoB", precoB);
                    finalizar.putExtra("precoM", precoM);
                    startActivity(finalizar);
                } else{
                    Toast.makeText(getApplicationContext(), "Voce precisa adicionar uma quantidade de algum produto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        voltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(inicio);
            }
        });

    }
}