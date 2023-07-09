package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bebidas extends AppCompatActivity {

    Button voltarInicio;
    Button aumentarSL, aumentarSLI, aumentarC;
    Button diminuirSL, diminuirSLI, diminuirC;
    Button irPraFinalizarPedido;
    TextView mostrarQuantidadeSL, mostrarQuantidadeSLI, mostrarQuantidadeC;
    Double precoSL = 7.50;
    Double precoSLI = 8.00;
    Double precoC = 10.00;
    public int quantidadeProdutosSL = 0, quantidadeProdutosSLI = 0, quantidadeProdutosC;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        //Suco de Laranja

        voltarInicio = findViewById(R.id.bebidasVoltarInicio);
        aumentarSL = findViewById(R.id.aumentarQuantidade4);
        diminuirSL = findViewById(R.id.diminuirQuantidade4);
        mostrarQuantidadeSL = findViewById(R.id.quantidadeView4);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoSucos);

        aumentarSL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosSL++;
                mostrarQuantidadeSL.setText(String.valueOf(quantidadeProdutosSL));
            }
        });

        diminuirSL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosSL == 0 ){

                }
                else{
                    quantidadeProdutosSL = quantidadeProdutosSL -1;
                }
                mostrarQuantidadeSL.setText(String.valueOf(quantidadeProdutosSL));
            }
        });

        //Suco de Limão

        voltarInicio = findViewById(R.id.bebidasVoltarInicio);
        aumentarSLI = findViewById(R.id.aumentarQuantidade5);
        diminuirSLI = findViewById(R.id.diminuirQuantidade5);
        mostrarQuantidadeSLI = findViewById(R.id.quantidadeView5);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoSucos);

        aumentarSLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosSLI++;
                mostrarQuantidadeSLI.setText(String.valueOf(quantidadeProdutosSLI));
            }
        });

        diminuirSLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosSLI == 0 ){

                }
                else{
                    quantidadeProdutosSLI = quantidadeProdutosSLI -1;
                }
                mostrarQuantidadeSLI.setText(String.valueOf(quantidadeProdutosSLI));
            }
        });

        //Coca

        voltarInicio = findViewById(R.id.bebidasVoltarInicio);
        aumentarC = findViewById(R.id.aumentarQuantidade7);
        diminuirC = findViewById(R.id.diminuirQuantidade7);
        mostrarQuantidadeC = findViewById(R.id.quantidadeView7);
        irPraFinalizarPedido = findViewById(R.id.finalizarPedidoSucos);

        aumentarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeProdutosC++;
                mostrarQuantidadeC.setText(String.valueOf(quantidadeProdutosC));
            }
        });

        diminuirC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosC == 0 ){

                }
                else{
                    quantidadeProdutosC = quantidadeProdutosC -1;
                }
                mostrarQuantidadeC.setText(String.valueOf(quantidadeProdutosC));
            }
        });

        irPraFinalizarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidadeProdutosSL > 0 || quantidadeProdutosSLI > 0 || quantidadeProdutosC > 0){
                    Intent finalizar = new Intent(Bebidas.this, finalizarpedido.class);
                    finalizar.putExtra("quantidadeProdutosSL", quantidadeProdutosSL);
                    finalizar.putExtra("quantidadeProdutosSLI", quantidadeProdutosSLI);
                    finalizar.putExtra("quantidadeProdutosC", quantidadeProdutosC);
                    finalizar.putExtra("precoSL", precoSL);
                    finalizar.putExtra("precoSLI", precoSLI);
                    finalizar.putExtra("precoC", precoC);
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