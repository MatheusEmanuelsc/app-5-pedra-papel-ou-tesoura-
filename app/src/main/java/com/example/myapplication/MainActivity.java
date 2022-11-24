package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void papel(View view){
        this.opcaoSelecionada("papel");
    }

    public void tesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcSelecionada){
        ImageView resultado= findViewById(R.id.resultado);
        TextView result = findViewById(R.id.result);
        int numero = new Random().nextInt(3);
        String[] opcoes={"pedra","papel","tesoura"};
        String opcoesApp=opcoes[numero];

        switch (opcoesApp){
            case "pedra":
                resultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                resultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcoesApp=="papel" && opcSelecionada=="pedra") ||
                (opcoesApp=="tesoura"&& opcSelecionada=="papel")||
                (opcoesApp=="pedra"&& opcSelecionada=="tesoura")
        ){
            result.setText("Vocẽ perdeu :(");

        }
        else if(
                (opcoesApp=="papel" && opcSelecionada=="tesoura") ||
                (opcoesApp=="tesoura"&& opcSelecionada=="pedra")||
                (opcoesApp=="pedra"&& opcSelecionada=="papel")
        ){
            result.setText("Parabens Vocẽ ganhou :D");
        }
        else{
            result.setText("empate '-'");
        }

    }
}