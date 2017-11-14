package com.example.josep.proyectosemana2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    private TextInputEditText fecha , nombre , telefono , email , descripcion;
    private FloatingActionButton botonFlotante;
    private int dia,mes ,ano;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =(TextInputEditText) findViewById(R.id.nombre);
        fecha =(TextInputEditText) findViewById(R.id.fecha);
        telefono =(TextInputEditText) findViewById(R.id.telefono);
        email =(TextInputEditText) findViewById(R.id.email);
        descripcion =(TextInputEditText) findViewById(R.id.descripcion);


    }
    public void setFecha(View v)
    {
        Calendar c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
        DatePickerDialog fechaElegida = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                fecha.setText(i + "/" +i1 + "/" + i2);
            }
        },dia,mes,ano);
        fechaElegida.show();
    }
    public void siguiente(View v)
    {

        Intent i = new Intent(this,ConfirmarDatos.class);
        i.putExtra("Nombre" , nombre.getText().toString());
        i.putExtra("Fecha",fecha.getText().toString());
        i.putExtra("Telefono" , telefono.getText().toString());
        i.putExtra("Email",email.getText().toString());
        i.putExtra("Descripcion" , descripcion.getText().toString());

        startActivity(i);
    }
}
