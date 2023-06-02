package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class TelaInicial extends AppCompatActivity {

    TextView resultado, escolhaMaquina;

    int escolhaUser, bot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        resultado = (TextView) findViewById(R.id.resultado);
        escolhaMaquina = (TextView) findViewById(R.id.escolhaMaquina);
    }

    public void Pedra (View v){

        escolhaUser = 0;

        Jogo(escolhaUser);

    }
    public void Tesoura (View v){
        escolhaUser = 1;

        Jogo(escolhaUser);

    }

    public void Papel(View v){

        escolhaUser = 2;

        Jogo(escolhaUser);
    }

    public void Jogo(int escolhaUser){
        Random rand = new Random();

        bot = rand.nextInt(3);

        if(bot == 0){
            escolhaMaquina.setText("Bot escolheu Pedra");
        }
        if(bot == 1){
            escolhaMaquina.setText("Bot escolheu Tesoura");
        }
        if(bot == 2){
            escolhaMaquina.setText("Bot escolheu Papel");
        }

        if (escolhaUser == bot){
            resultado.setText("Empate");
        }

        if(escolhaUser == 0 && bot == 1){
            resultado.setText("Você Venceu");
        }

        if(escolhaUser == 1 && bot == 2){
            resultado.setText("Você Venceu");
        }

        if(escolhaUser == 2 && bot == 0){
            resultado.setText("Você Venceu");
        }

        if(bot == 0 && escolhaUser == 1){
            resultado.setText("Você Perdeu");
        }

        if(bot == 1 && escolhaUser == 2){
            resultado.setText("Você Perdeu");
        }

        if(bot == 2 && escolhaUser == 0){
            resultado.setText("Você Perdeu");
        }
    }



}