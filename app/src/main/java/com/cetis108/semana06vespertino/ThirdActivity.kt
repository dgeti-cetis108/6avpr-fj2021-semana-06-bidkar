package com.cetis108.semana06vespertino

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // cambiar titulo a la barra de titulo (vlr)
        supportActionBar!!.title = "Regresar"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // obtener el valor de saludo
        val saludo = intent.getStringExtra("saludo")
        val tv_saludo = findViewById<TextView>(R.id.tv_saludo)
        tv_saludo.text = saludo

        // mostrar un cuadro de dialogo con el mensaje objetido desde Main
        val builder = AlertDialog.Builder(this)
        builder.setMessage(saludo)
            .setCancelable(false)
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                dialog, id -> finish()
            })
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                dialog, id -> dialog.cancel()
            })

        val alert = builder.create()
        alert.setTitle("Saludo")
        alert.show()
    }
}