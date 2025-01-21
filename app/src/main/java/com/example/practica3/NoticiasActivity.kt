package com.example.practica3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoticiasActivity : AppCompatActivity(){

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.noticias_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.noticias)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cardView1 : CardView = findViewById(R.id.cardview1)
        cardView1.setOnClickListener{ val url = "https://www.elmundo.es/como/2024/07/15/6694dbe0e85ecec86e8b457d.html"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo1 : TextView = findViewById(R.id.textView5)
        titulo1.setText(R.string.titulo1)
        val descripcion1 : TextView = findViewById(R.id.textView6)
        descripcion1.setText(R.string.descripcion1)

        val cardView2 : CardView = findViewById(R.id.cardview2)
        cardView2.setOnClickListener{ val url = "https://www.xataka.com/videojuegos/pensaba-que-gaming-pc-no-podria-volver-a-sorprenderme-entonces-probe-dlss-4-rtx-5090"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo2 : TextView = findViewById(R.id.textView7)
        titulo2.setText(R.string.titulo2)
        val descripcion2 : TextView = findViewById(R.id.textView8)
        descripcion2.setText(R.string.descripcion2)

        val cardView3 : CardView = findViewById(R.id.cardview3)
        cardView3.setOnClickListener{ val url = "https://www.xatakahome.com/centro-multimedia/ps5-pro-caracteristicas-precio-ficha-tecnica"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo3 : TextView = findViewById(R.id.textView9)
        titulo3.setText(R.string.titulo3)
        val descripcion3 : TextView = findViewById(R.id.textView10)
        descripcion3.setText(R.string.descripcion3)

        val cardView4 : CardView = findViewById(R.id.cardview4)
        cardView4.setOnClickListener{ val url = "https://www.dxtcampeon.com/articulo/depor/sede-mundial-2030-flaquea-norte-espana-no-coruna-sino-san-sebastian-5139441"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo4 : TextView = findViewById(R.id.textView11)
        titulo4.setText(R.string.titulo4)
        val descripcion4 : TextView = findViewById(R.id.textView12)
        descripcion4.setText(R.string.descripcion4)

        val cardView5 : CardView = findViewById(R.id.cardview5)
        cardView5.setOnClickListener{ val url = "https://www.merca2.es/2025/01/16/iphone-17-2115679/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo5 : TextView = findViewById(R.id.textView13)
        titulo5.setText(R.string.titulo5)
        val descripcion5 : TextView = findViewById(R.id.textView14)
        descripcion5.setText(R.string.descripcion5)

        val cardView6 : CardView = findViewById(R.id.cardview6)
        cardView6.setOnClickListener{ val url = "https://www.marca.com/videojuegos/hardware/2025/01/16/67894a0822601d7a3c8b4585.html"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo6: TextView = findViewById(R.id.textView3)
        titulo6.setText(R.string.titulo6)
        val descripcion6 : TextView = findViewById(R.id.textView4)
        descripcion6.setText(R.string.descripcion6)

        val cardView7 : CardView = findViewById(R.id.cardview7)
        cardView7.setOnClickListener{ val url = "https://www.eurosport.es/futbol/supercopa-de-espana/2024-2025/supercopa-de-espana-2024-25-real-madrid-barcelona-video-resumen-goles-y-resultado-de-la-final-hoy_vid2294816/video.shtml"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo7 : TextView = findViewById(R.id.textView15)
        titulo7.setText(R.string.titulo7)
        val descripcion7 : TextView = findViewById(R.id.textView16)
        descripcion7.setText(R.string.descripcion7)

        val cardView8 : CardView = findViewById(R.id.cardview8)
        cardView8.setOnClickListener{ val url = "https://www.eltiempo.es/noticias/los-expertos-descifran-las-causas-de-los-incendios-de-los-angeles"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo8 : TextView = findViewById(R.id.textView17)
        titulo8.setText(R.string.titulo8)
        val descripcion8 : TextView = findViewById(R.id.textView18)
        descripcion8.setText(R.string.descripcion8)

        val cardView9 : CardView = findViewById(R.id.cardview9)
        cardView9.setOnClickListener{ val url = "https://elpais.com/tecnologia/2025-01-15/meta-desarrolla-un-traductor-simultaneo-de-hasta-101-idiomas-con-una-mayor-precision-que-los-sistemas-actuales.html"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo9 : TextView = findViewById(R.id.textView19)
        titulo9.setText(R.string.titulo9)
        val descripcion9 : TextView = findViewById(R.id.textView20)
        descripcion9.setText(R.string.descripcion9)

        val cardView10 : CardView = findViewById(R.id.cardview10)
        cardView10.setOnClickListener{ val url = "https://www.businessinsider.es/economia/millonaria-renovacion-cristiano-ronaldo-nassr-convertira-futuro-presidente-club-1436234"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)}
        val titulo10 : TextView = findViewById(R.id.textView21)
        titulo10.setText(R.string.titulo10)
        val descripcion10 : TextView = findViewById(R.id.textView22)
        descripcion10.setText(R.string.descripcion10)
    }
}