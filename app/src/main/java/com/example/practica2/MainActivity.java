package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cNum = findViewById(R.id.gNum);
    }//Fin onCreate

    public void Aceptar(View ver){
        String dato = cNum.getText().toString();
        int num;
        if(dato.isEmpty()){
            Toast.makeText(this, "DEBES INGRESAR UN NÚMERO", Toast.LENGTH_LONG).show();
        }else{
            num = Integer.parseInt(dato);
        if(num <= 0){
            Toast.makeText(this, "INGRESA UN NÚMERO MAYOR A CERO", Toast.LENGTH_LONG).show();
        }else if(num>100){
            Toast.makeText(this, "INGRESA UN NÚMERO MENOR", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "EL NÚMERO FUE " +num, Toast.LENGTH_LONG).show();
        }
        }//Fin else isEmpty

    }//Fin método Aceptar

}//Fin MainActivity