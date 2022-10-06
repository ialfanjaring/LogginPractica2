package com.iesch.alfanjarin.ivan.logginpractica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.iesch.alfanjarin.ivan.logginpractica2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());

        // BOTON GUARDAR
        binding.saveButton.setOnClickListener(v -> {
            // 3 b - Captamos la información de las diferentes vistas
            String usuario = binding.logginEdit.getText().toString();
            String password = binding.passwordEdit.getText().toString();
            

            abrirDetailActivity(usuario,password);

        });
    }

    private void abrirDetailActivity(String usuario, String password) {
        Intent irADetalle = new Intent(this,DetailActivity.class);
        irADetalle.putExtra("usuario",usuario);
        irADetalle.putExtra("password",password);
        startActivity(irADetalle);
    }
}