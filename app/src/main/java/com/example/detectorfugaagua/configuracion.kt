package com.example.detectorfugaagua

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_configuracion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val volverInicio: Button = findViewById(R.id.btn_menu_inicial)
        volverInicio.setOnClickListener {

            val intent = Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
        }

        val verSensores: Button = findViewById(R.id.btn_ir_a_sensores)
        verSensores.setOnClickListener {

            val intent = Intent(this, Sensores::class.java)
            startActivity(intent)
        }

        val cerrarSesion: Button = findViewById(R.id.btn_cerrar_sesion)
        cerrarSesion.setOnClickListener {


            val intent = Intent(this, Login::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

    }
}