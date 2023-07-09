package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class finalizarpedido extends AppCompatActivity {

    TextView mostrarPedido, valortotal;
    Button voltarPedidos;
    double precoXqntdD ,precoXqntdXB, precoXqntXF, valorTotalNumber;
    double precoSqntL, precoSqntdLI, precoSqntC;
    double precoqntP, precoqntdB, precoqntM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_pedido);

        mostrarPedido = findViewById(R.id.mostrarPedidos);
        voltarPedidos = findViewById(R.id.voltarPedidos2);
        valortotal = findViewById(R.id.valorTotal);


        voltarPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pedidos = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pedidos);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int quantidadeProdutosD = extras.getInt("quantidadeProdutosD");
            int quantidadeProdutosXB = extras.getInt("quantidadeProdutosXB");
            int quantidadeProdutosXF = extras.getInt("quantidadeProdutosXF");
            double precoD = extras.getDouble("precoD");
            double precoXB = extras.getDouble("precoXB");
            double precoXF = extras.getDouble("precoXF");
            precoXqntdD = precoD * quantidadeProdutosD;
            precoXqntdXB = precoXB * quantidadeProdutosXB;
            precoXqntXF = precoXF * quantidadeProdutosXF;

            //Formula para armazenar os pedidos

            StringBuilder pedido = new StringBuilder();

            if (quantidadeProdutosD > 0){
                pedido.append(" Duplo: " + quantidadeProdutosD + "    Valor: " + precoXqntdD + "R$");
            }

            if (quantidadeProdutosXB > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" XBacon: " + quantidadeProdutosXB + "    Valor: " + precoXqntdXB + "R$");
            }

            if (quantidadeProdutosXF > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" XFrango: " + quantidadeProdutosXF + "   Valor: " + precoXqntXF + "R$");
            }
            mostrarPedido.setText(pedido.toString());

            //Sucos

            int quantidadeProdutosSL = extras.getInt("quantidadeProdutosSL");
            int quantidadeProdutosSLI = extras.getInt("quantidadeProdutosSLI");
            int quantidadeProdutosC = extras.getInt("quantidadeProdutosC");
            double precoSL = extras.getDouble("precoSL");
            double precoSLI = extras.getDouble("precoSLI");
            double precoC = extras.getDouble("precoC");
            precoSqntL = precoSL * quantidadeProdutosSL;
            precoSqntdLI = precoSLI * quantidadeProdutosSLI;
            precoSqntC= precoC * quantidadeProdutosC;

            if (quantidadeProdutosSL > 0 ){
                pedido.append(" Suco de Laranja: " + quantidadeProdutosSL + "    Valor: " + precoSqntL + "R$");
            }
            if (quantidadeProdutosSLI > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" Suco De Limão: " + quantidadeProdutosSLI + "    Valor: " + precoSqntdLI + "R$");
            }

            if (quantidadeProdutosC > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" Coca: " + quantidadeProdutosC + "   Valor: " + precoSqntC + "R$");
            }
            mostrarPedido.setText(pedido.toString());

            //Doces

            int quantidadeProdutosP = extras.getInt("quantidadeProdutosP");
            int quantidadeProdutosB = extras.getInt("quantidadeProdutosB");
            int quantidadeProdutosM = extras.getInt("quantidadeProdutosM");
            double precoP = extras.getDouble("precoP");
            double precoB = extras.getDouble("precoB");
            double precoM = extras.getDouble("precoM");
            precoqntP = precoP * quantidadeProdutosP;
            precoqntdB = precoB * quantidadeProdutosB;
            precoqntM= precoM * quantidadeProdutosM;

            if (quantidadeProdutosP > 0 ){
                pedido.append(" Pudim: " + quantidadeProdutosP + "    Valor: " + precoqntP + "R$");
            }
            if (quantidadeProdutosB > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" Bolinho: " + quantidadeProdutosB + "    Valor: " + precoqntdB + "R$");
            }

            if (quantidadeProdutosM > 0){
                if (pedido.length() > 0){
                    pedido.append("\n");
                }
                pedido.append(" Milk Shake: " + quantidadeProdutosM + "   Valor: " + precoqntM + "R$");
            }
            mostrarPedido.setText(pedido.toString());
        }

    }
}