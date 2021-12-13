package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador;
    //Opcio 1
    //TextView contadorDeClics;
    //Button augmentarElContador;
    //Opcio 2
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        //No hace falta en este programa formato pero si lo pones lo dejas fijo
        contador= 0;

        //Opcio 1
        //contadorDeClics = findViewById(R.id.textContador);
        //augmentarElContador = findViewById(R.id.botonIncr);

        //Opcio 1
        //augmentarElContador.setOnClickListener(new View.OnClickListener() {

        //Opcio 2
        binding.botonIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aumentar el contador
                contador++;
                // mostrar el contador en el TextView
                //Opcio 1
                //Catala
                //contadorDeClics.setText("Has clicat " + contador + " cops");
                //Castella
                //contadorDeClics.setText("Has clicado " + contador + " veces");
                //Opcio 2
                //Catala
                binding.textContador.setText("Has clicat " + contador + " cops");
                //Castella
                //binding.textContador.setText("Has clicado " + contador + " veces");


            }
        });
    }

}