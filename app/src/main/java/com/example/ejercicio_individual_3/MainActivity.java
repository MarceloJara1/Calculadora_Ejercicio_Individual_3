package com.example.ejercicio_individual_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private calculadora calc;
    private EditText numero_1;
    private EditText numero_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener referencias desde los editText
        EditText numero_1 = (EditText) findViewById(R.id.inputPrimerNumero);
        EditText numero_2 = (EditText) findViewById(R.id.inputSegundoNumero);


        //Crear instancia en la clase calculadora
        calc = new calculadora(numero_1, numero_2);


    }
}