package com.cetis108.semana06vespertino

import android.content.Intent
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
            var textMensaje = findViewById<EditText>(R.id.et_main_mensaje).text.toString()

            if (textMensaje.isEmpty()) {
                textMensaje = "Escribe algo en la caja de texto!"
            }
            labelSaludo.text = textMensaje
        }

        // Intent explícito: como navegar hacia otra activity
        val buttonGoToSecond = findViewById<Button>(R.id.btn_main_gotosecond)

        buttonGoToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}