package com.example.ronnycabrera.dialogos;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar(View v) {
        dialogoAlerta();
    }

    public void dialogoAlerta() {
        AlertDialog.Builder alertaDialogo = new AlertDialog.Builder(this);
        alertaDialogo.setTitle("Mensaje : Titulo");
        alertaDialogo.setMessage("cuerpo del mensaje");

        alertaDialogo.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "SI", Toast.LENGTH_LONG).show();
            }
        });
        alertaDialogo.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_LONG).show();
            }
        });
        alertaDialogo.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_LONG).show();
            }
        });

        alertaDialogo.setCancelable(true);
        alertaDialogo.create();
        alertaDialogo.show();
    }

}
