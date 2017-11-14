package com.example.josep.proyectosemana2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity
{

    LinearLayout info;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle intento = getIntent().getExtras();
        info = (LinearLayout)findViewById(R.id.info);
        info.addView(new Texto(this , "Nombre: " + intento.getString("Nombre")));
        info.addView(new Texto(this , "Fecha: " + intento.getString("Fecha")));
        info.addView(new Texto(this , "Tel: " + intento.getString("Telefono")));
        info.addView(new Texto(this , "Email: " + intento.getString("Email")));
        info.addView(new Texto(this , "Descripcion: " + intento.getString("Descripcion")));

    }
    class Texto extends android.support.v7.widget.AppCompatTextView
    {
        public Texto(Context context , String a)
        {
            super(context);
            this.setText("  " + a);

        }
    }
    public void editar(View v)
    {
        finish();
    }

}
