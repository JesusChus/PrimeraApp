package com.chusdevil.botom_toast

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar()
    }

    private fun iniciar() {
        boton = findViewById(R.id.btToast)
        boton.setOnClickListener { Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show() }

    }

}

