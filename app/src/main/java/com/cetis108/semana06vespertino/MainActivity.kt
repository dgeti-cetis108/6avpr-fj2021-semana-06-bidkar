package com.cetis108.semana06vespertino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val labelSaludo = findViewById<TextView>(R.id.tv_main_saludo)
        val buttonSaludar = findViewById<Button>(R.id.btn_main_saludar)

        buttonSaludar.setOnClickListener {
            val textMensaje = findViewById<EditText>(R.id.et_main_mensaje).text.toString()
            // TODO: validar que cuando la caja de texto esté vacía lo señale el labelSaludo
            labelSaludo.text = textMensaje
        }
    }
}