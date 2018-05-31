package com.example.ronnycabrera.dialogos;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar(View v) {
        dialogoMultiChoose();
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

    public void dialogoLista() {
        final CharSequence[] items = {"Articulo 1","Articulo 2","Articulo 3", "Articulo 4"};

        AlertDialog.Builder alertaDialogo = new AlertDialog.Builder(this);
        alertaDialogo.setTitle("Mensaje : Titulo");

        alertaDialogo.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_LONG).show();
            }
        });

        alertaDialogo.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int j) {
                Toast.makeText(getApplicationContext(), items[j], Toast.LENGTH_LONG).show();
            }
        });

        alertaDialogo.setCancelable(true);
        alertaDialogo.create();
        alertaDialogo.show();
    }

    public void dialogoSingleChoose() {
        final CharSequence[] items = {"Articulo 1","Articulo 2","Articulo 3", "Articulo 4"};

        AlertDialog.Builder alertaDialogo = new AlertDialog.Builder(this);
        alertaDialogo.setTitle("Mensaje : Titulo");

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
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_LONG).show();
            }
        });

        alertaDialogo.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int j) {
                Toast.makeText(getApplicationContext(), items[j], Toast.LENGTH_LONG).show();
            }
        });

        alertaDialogo.setCancelable(true);
        alertaDialogo.create();
        alertaDialogo.show();
    }

    public void dialogoMultiChoose() {
        final CharSequence[] items = {"Articulo 1","Articulo 2","Articulo 3", "Articulo 4"};
        final ArrayList seleccinados = new ArrayList();

        AlertDialog.Builder alertaDialogo = new AlertDialog.Builder(this);
        alertaDialogo.setTitle("Mensaje : Titulo");

        alertaDialogo.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                String mensaje = "";
                for (int j = 0; j < seleccinados.size(); j++) {
                    mensaje = mensaje + items[Integer.parseInt(seleccinados.get(j).toString())].toString();
                }
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
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

        alertaDialogo.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean isChecked) {
                if(isChecked) {
                    seleccinados.add(i);
                }else {
                    seleccinados.remove(i);
                }
            }
        });

        alertaDialogo.setCancelable(true);
        alertaDialogo.create();
        alertaDialogo.show();
    }
}
