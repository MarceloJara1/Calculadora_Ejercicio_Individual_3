package com.example.ejercicio_individual_3;

import android.widget.EditText;

public class calculadora {
    private EditText numero_1;
    private EditText numero_2;

    public calculadora(EditText numero_1, EditText numero_2){
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }

    public int obtenerNumero1(){
        String strNumero1 = numero_1.getText().toString();
        return Integer.parseInt(strNumero1);
    }

    public int obtenerNumero2(){
        String strNumero2 = numero_2.getText().toString();
        return Integer.parseInt(strNumero2);
    }

}
