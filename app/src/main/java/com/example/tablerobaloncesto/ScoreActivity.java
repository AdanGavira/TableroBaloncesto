package com.example.tablerobaloncesto;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tablerobaloncesto.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar View Binding
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener las puntuaciones del Intent
        int puntuacionLocal = getIntent().getIntExtra(MainActivity.EXTRA_PUNTUACION_LOCAL, 0);
        int puntuacionVisitante = getIntent().getIntExtra(MainActivity.EXTRA_PUNTUACION_VISITANTE, 0);

        // Mostrar el marcador final usando el formato del strings.xml
        String marcadorFinal = getString(R.string.formato, puntuacionLocal, puntuacionVisitante);
        binding.MarcadorFinal.setText(marcadorFinal);

        // Determinar el ganador y mostrar el mensaje correspondiente
        String mensajeGanador;
        int colorMensaje;

        if (puntuacionLocal > puntuacionVisitante) {
            // Ganó el equipo Local
            mensajeGanador = getString(R.string.local_gana);
            colorMensaje = getResources().getColor(android.R.color.holo_blue_dark, null);
        } else if (puntuacionVisitante > puntuacionLocal) {
            // Ganó el equipo Visitante
            mensajeGanador = getString(R.string.visitante_gana);
            colorMensaje = getResources().getColor(android.R.color.holo_orange_dark, null);
        } else {
            // Empate
            mensajeGanador = getString(R.string.empate);
            colorMensaje = getResources().getColor(android.R.color.darker_gray, null);
        }

        binding.MensajeGanador.setText(mensajeGanador);
        binding.MensajeGanador.setTextColor(colorMensaje);

        // Botón para volver
        binding.btnVolver.setOnClickListener(v -> finish());
    }
}