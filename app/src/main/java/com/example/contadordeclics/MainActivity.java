package com.example.contadordeclics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int contadorTotal, contador1, contador2, contador3, contador4 = 0;

    TextView contadorTotaltxt, contador1txt, contador2txt, contador3txt, contador4txt;
    Button contadorbtn1, contadorbtn2, contadorbtn3, contadorbtn4;
    Button reset1, reset2, reset3, reset4, resetAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Inicializamos las vistas
        contadorTotaltxt = findViewById(R.id.contadorTotal);
        contador1txt = findViewById(R.id.contador1);
        contador2txt = findViewById(R.id.contador2);
        contador3txt = findViewById(R.id.contador3);
        contador4txt = findViewById(R.id.contador4);

        contadorbtn1 = findViewById(R.id.boton1);
        contadorbtn2 = findViewById(R.id.boton2);
        contadorbtn3 = findViewById(R.id.boton3);
        contadorbtn4 = findViewById(R.id.boton4);

        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        resetAll = findViewById(R.id.resetAll);

    // INCREMENTAR CONTADORES
        contadorbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                update();
            }
        });

        contadorbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                update();
            }
        });

        contadorbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                update();
            }
        });

        contadorbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                update();
            }
        });

    // RESETEAR CONTADORES
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                update();
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2 = 0;
                update();
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3 = 0;
                update();
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4 = 0;
                update();
            }
        });

    //RESETEAR TODOS LOS CONTADORES
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorTotal = 0;
                update();
            }
        });

        update();
    }

    // ACTUALIZAR TEXTOS
    private void update() {
        contador1txt.setText(String.valueOf(contador1));
        contador2txt.setText(String.valueOf(contador2));
        contador3txt.setText(String.valueOf(contador3));
        contador4txt.setText(String.valueOf(contador4));

        contadorTotal = contador1 + contador2 + contador3 + contador4;
        contadorTotaltxt.setText(String.valueOf(contadorTotal));
    }

}