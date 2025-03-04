package com.example.practica3

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NoticiasAdapter(private val context: Context, private val noticias: List<Noticia>) :
    RecyclerView.Adapter<NoticiasAdapter.NoticiaViewHolder>() {

    class NoticiaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagenNoticia: ImageView = view.findViewById(R.id.imagenNoticia)
        val tituloNoticia: TextView = view.findViewById(R.id.tituloNoticia)
        val resumenNoticia: TextView = view.findViewById(R.id.resumenNoticia)
        val fechaNoticia: TextView = view.findViewById(R.id.fechaNoticia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_noticia, parent, false)
        return NoticiaViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val noticia = noticias[position]
        holder.tituloNoticia.text = noticia.titulo
        holder.resumenNoticia.text = noticia.resumen
        holder.fechaNoticia.text = noticia.fecha

        Glide.with(context)
            .load(noticia.imagenPortada)
            .into(holder.imagenNoticia)

        holder.itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(noticia.enlace))
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = noticias.size
}
