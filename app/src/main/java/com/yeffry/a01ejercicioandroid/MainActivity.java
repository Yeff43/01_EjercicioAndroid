package com.yeffry.a01ejercicioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombree;
    private Button btnReset;
    private Button btnSaludar;
    private TextView mostrarSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();


        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextNombree.getText().toString().trim().equals("") || editTextNombree.getText().toString().trim().equals(" ")){
                    Toast.makeText(MainActivity.this, "No has Escrito un nombre", Toast.LENGTH_SHORT).show();
                }else{
                    String nombre = editTextNombree.getText().toString();
                    editTextNombree.getText().clear();
                    mostrarSaludo.setText("Hola " + nombre + "!!");
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarSaludo.setText("");
            }
        });


    }

    private void inicializarVista() {
        editTextNombree = findViewById(R.id.editTextNombre);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        mostrarSaludo = findViewById(R.id.txtSaludos);
    }
}