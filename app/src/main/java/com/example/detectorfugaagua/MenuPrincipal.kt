package com.example.detectorfugaagua

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_principal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val verSensores: Button = findViewById(R.id.btn_sensores)
        verSensores.setOnClickListener {

            val intent = Intent(this, Sensores::class.java)
            startActivity(intent)
        }

        val irconfiguracion: Button = findViewById(R.id.btn_opciones)
        irconfiguracion.setOnClickListener {

            val intent = Intent(this, configuracion::class.java)
            startActivity(intent)
        }
    }
}