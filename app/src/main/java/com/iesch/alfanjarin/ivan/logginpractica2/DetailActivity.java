package com.iesch.alfanjarin.ivan.logginpractica2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.iesch.alfanjarin.ivan.logginpractica2.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        TextView txtInicio = binding.textInicio;

        String usuarioV = extras.getString("usuario");
        txtInicio.setText("Usuario: " + usuarioV);

    }
}