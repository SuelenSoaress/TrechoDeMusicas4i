package com.example.suelen4i;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void sortear(View view){
       String[] trechos= {"Olha que coisa mais linda, mais cheia de graça, é ela menina que vem e que passa...",
               "Brasil, meu Brasil brasileiro, meu mulato inzoneiro, vou cantar-te nos meus versos.." +
                       "Vai minha tristeza, e diz a ela que sem ela não pode ser, diz-lhe numa prece que ela regresse, porque eu não posso mais sofrer...",
               "Não posso ficar nem mais um minuto com você, sinto muito amor, mas não pode ser...",
               "Há um ponto de luz na imensidão da noite, aonde o sertão e o mar se encontram...",
               " E então diz que quer casar, sua noiva não pode esperar, e então diz que vai se casar, joga fora o comprovante de reservista..."};

       Random random = new Random();
       int indiceMusicas = random.nextInt(trechos.length);
       
        String musicasSorteada = trechos[indiceMusicas];

        TextView textResultado = findViewById(R.id.textResultado);
        textResultado.setText(musicasSorteada);

    }
}