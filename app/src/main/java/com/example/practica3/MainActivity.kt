package com.example.practica3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textoNombre = findViewById<TextInputEditText>(R.id.introducirNombre)
        val textoPassw = findViewById<TextInputEditText>(R.id.introducirPass)
        val botonLogin = findViewById<Button>(R.id.button)

        val sharedPreferences = getSharedPreferences("user_preferences", Context.MODE_PRIVATE)

        val savedNom = sharedPreferences.getString("user_name", "")
        val savedPass = sharedPreferences.getString("user_pass", "")

        if (!savedNom.isNullOrEmpty()) {
            textoNombre.setText(savedNom)
        }
        if (!savedPass.isNullOrEmpty()) {
            textoPassw.setText(savedPass)
        }

        botonLogin.setOnClickListener {
            val nom = textoNombre.text.toString().trim()
            val passw = textoPassw.text.toString().trim()

            if (nom.isNotEmpty() && passw.isNotEmpty()) {
                val editor = sharedPreferences.edit()
                editor.putString("user_name", nom)
                editor.putString("user_pass", passw)
                editor.apply()

                Toast.makeText(this, "Usuario guardado", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, NoticiasActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "No pueden haber campos vacios", Toast.LENGTH_SHORT).show()
            }
        }
    }
}