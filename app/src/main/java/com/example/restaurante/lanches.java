package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class lanches extends AppCompatActivity {
    Button voltarInicio;
    Button aumentarD, aumentarXB, aumentarXF;
    Button diminuirD, diminuirXB, diminuirXF;
    Button irPraFinalizarPedido;
    TextView mostrarQuantidadeD, mostrarQuantidadeXB, mostrarQuantidadeXF;
    Double precoD = 12.50;
    Double precoXB = 13.00;
    Double precoXF = 14.00;
    public int quantidadeProdutosD = 0, quantidadeProdutosXB = 0, quantidadeProdutosXF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanches);

        //Duplo
        voltarInicio = findViewById(R.id.lanchesVoltarInicio);
        aumentarD = findViewById(R.id.aumentarQuantidade);
        diminuirD = findViewById(R.id.diminuirQuantidade);
        mostrarQuantidadeD = findViewById(R.id.quantidadeView);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoLanches);

        aumentarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosD++;
                mostrarQuantidadeD.setText(String.valueOf(quantidadeProdutosD));
            }
        });

        diminuirD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosD == 0 ){

                }
                else{
                    quantidadeProdutosD = quantidadeProdutosD -1;
                }
                mostrarQuantidadeD.setText(String.valueOf(quantidadeProdutosD));
            }
        });

        //X BACON
        aumentarXB = findViewById(R.id.aumentarQuantidade2);
        diminuirXB = findViewById(R.id.diminuirQuantidade2);
        mostrarQuantidadeXB = findViewById(R.id.quantidadeView2);

        aumentarXB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosXB++;
                mostrarQuantidadeXB.setText(String.valueOf(quantidadeProdutosXB));
            }
        });

        diminuirXB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosXB == 0){

                }
                else{
                    quantidadeProdutosXB = quantidadeProdutosXB -1;
                }
                mostrarQuantidadeXB.setText(String.valueOf(quantidadeProdutosXB));
            }
        });

        //X FRANGO

        aumentarXF = findViewById(R.id.aumentarQuantidade3);
        diminuirXF = findViewById(R.id.diminuirQuantidade3);
        mostrarQuantidadeXF = findViewById(R.id.quantidadeView3);

        aumentarXF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosXF++;
                mostrarQuantidadeXF.setText(String.valueOf(quantidadeProdutosXF));
            }
        });

        diminuirXF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosXF == 0){

                }
                else{
                    quantidadeProdutosXF = quantidadeProdutosXF -1;
                }
                mostrarQuantidadeXF.setText(String.valueOf(quantidadeProdutosXF));
            }
        });

        irPraFinalizarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosD > 0 || quantidadeProdutosXB > 0 || quantidadeProdutosXF > 0){
                    Intent finalizar = new Intent(lanches.this, finalizarpedido.class);
                    finalizar.putExtra("quantidadeProdutosD", quantidadeProdutosD);
                    finalizar.putExtra("quantidadeProdutosXB", quantidadeProdutosXB);
                    finalizar.putExtra("quantidadeProdutosXF", quantidadeProdutosXF);
                    finalizar.putExtra("precoD", precoD);
                    finalizar.putExtra("precoXB", precoXB);
                    finalizar.putExtra("precoXF", precoXF);
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