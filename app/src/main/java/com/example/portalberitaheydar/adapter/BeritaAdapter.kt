package com.example.portalberitaheydar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portalberitaheydar.R
import com.example.portalberitaheydar.data.Berita

class BeritaAdapter(private val list: ArrayList<Berita>)
    : RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>() {
    class BeritaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val judul = itemView.findViewById<TextView>(R.id.judulBerita)
//        private val imgGambar = itemView.findViewById<TextView>(R.id.imgView)
        private val desc = itemView.findViewById<TextView>(R.id.deskripsi)

        fun bind(get: Berita) {
            judul.text = get.judul
           // imgGambar.setImageResource()
            desc.text = get.desc

            judul.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        return BeritaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_berita, parent, false))
    }

    override fun onBindViewHolder(holder: BeritaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}