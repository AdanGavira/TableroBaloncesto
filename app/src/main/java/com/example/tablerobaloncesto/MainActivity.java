package com.example.tablerobaloncesto;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tablerobaloncesto.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Constantes para pasar datos entre Activities
    public static final String EXTRA_PUNTUACION_LOCAL = "extra_puntuacion_local";
    public static final String EXTRA_PUNTUACION_VISITANTE = "extra_puntuacion_visitante";

    // View Binding
    private ActivityMainBinding binding;

    // Variables para almacenar las puntuaciones
    private int puntuacionLocal = 0;
    private int puntuacionVisitante = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar View Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configurar listeners para botones del Equipo Local
        binding.btnLocalMas1.setOnClickListener(v -> sumarPuntosLocal(1));
        binding.btnLocalMas2.setOnClickListener(v -> sumarPuntosLocal(2));
        binding.btnLocalMenos1.setOnClickListener(v -> restarPuntosLocal(1));

        // Configurar listeners para botones del Equipo Visitante
        binding.btnVisitanteMas1.setOnClickListener(v -> sumarPuntosVisitante(1));
        binding.btnVisitanteMas2.setOnClickListener(v -> sumarPuntosVisitante(2));
        binding.btnVisitanteMenos1.setOnClickListener(v -> restarPuntosVisitante(1));

        // Botón Reiniciar
        binding.btnReiniciar.setOnClickListener(v -> reiniciarMarcador());

        // Botón Ver Resultados
        binding.btnVerResultados.setOnClickListener(v -> mostrarResultados());
    }

    //Suma puntos al equipo Local
    private void sumarPuntosLocal(int puntos) {
        puntuacionLocal += puntos;
        actualizarPuntuacionLocal();
    }

    //Resta puntos al equipo Local
    private void restarPuntosLocal(int puntos) {
        puntuacionLocal -= puntos;
        // Validación: no permitir puntuaciones negativas
        if (puntuacionLocal < 0) {
            puntuacionLocal = 0;
        }
        actualizarPuntuacionLocal();
    }

    //Suma puntos al equipo Visitante
    private void sumarPuntosVisitante(int puntos) {
        puntuacionVisitante += puntos;
        actualizarPuntuacionVisitante();
    }

    //Resta puntos al equipo Visitante
    private void restarPuntosVisitante(int puntos) {
        puntuacionVisitante -= puntos;
        //no permite puntuaciones negativas
        if (puntuacionVisitante < 0) {
            puntuacionVisitante = 0;
        }
        actualizarPuntuacionVisitante();
    }

    //Actualiza el TextView con la puntuación del equipo Local
    private void actualizarPuntuacionLocal() {
        binding.PuntuacionLocal.setText(String.valueOf(puntuacionLocal));
    }

    //Actualiza el TextView con la puntuación del equipo Visitante
    private void actualizarPuntuacionVisitante() {
        binding.PuntuacionVisitante.setText(String.valueOf(puntuacionVisitante));
    }

    //Reinicia ambos marcadores a 0
    private void reiniciarMarcador() {
        puntuacionLocal = 0;
        puntuacionVisitante = 0;
        actualizarPuntuacionLocal();
        actualizarPuntuacionVisitante();
    }

    //Pasa resultados a ScoreActivity mediante intent
    private void mostrarResultados() {
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra(EXTRA_PUNTUACION_LOCAL, puntuacionLocal);
        intent.putExtra(EXTRA_PUNTUACION_VISITANTE, puntuacionVisitante);
        startActivity(intent);
    }
}