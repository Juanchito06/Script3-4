package com.example.sprint3_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        Button botonMostrarLista = findViewById(R.id.botonMostrarLista);

        // Lista de elementos (tiendas)
        String[] items = {"Éxito", "Carulla", "Alkosto", "Jumbo", "Olímpica", "D1"};

        // Configurar el listener para el botón
        botonMostrarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un AlertDialog para mostrar la lista
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Selecciona una tienda");

                // Agregar la lista de elementos al AlertDialog
                builder.setItems(items, (dialog, which) -> {
                    // Mostrar un mensaje cuando el usuario selecciona un elemento
                    String itemSeleccionado = items[which];
                    Toast.makeText(MainActivity.this, "Seleccionaste: " + itemSeleccionado, Toast.LENGTH_SHORT).show();
                });

                // Mostrar el AlertDialog
                builder.show();
            }
        });
        Button botonMostrarProductos = findViewById(R.id.botonMostrarProductos);

        // Lista de elementos (productos)
        String[] productos = {"Arroz", "Café", "Leche", "Aceite", "Lentejas", "Chocolate", "Huevos"};

        // Configurar el listener para el segundo botón
        botonMostrarProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un AlertDialog para mostrar la lista de productos
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Selecciona un producto");

                // Agregar la lista de productos al AlertDialog
                builder.setItems(productos, (dialog, which) -> {
                    // Mostrar un mensaje cuando el usuario selecciona un producto
                    String itemSeleccionado = productos[which];
                    Toast.makeText(MainActivity.this, "Seleccionaste: " + itemSeleccionado, Toast.LENGTH_SHORT).show();
                });

                // Mostrar el AlertDialog
                builder.show();
            }
        });


/*
        Button botonMostrarLista = new Button(this);
        botonMostrarLista.setText("Mostrar lista");
        setContentView(botonMostrarLista);

        String[] items={"Exito", "Carulla","Alkosto","Jumbo","Olimpica","D1"};
        botonMostrarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Seleccione una tienda");

                builder.setItems(items, (dialog, which) -> {
                    String itemSeleccionado = items[which];
                    Toast.makeText(MainActivity.this, "Seleccionaste: "+ itemSeleccionado, Toast.LENGTH_SHORT).show();
                });
                builder.show();
            }
        });

 */


    }
}