package com.example.myjuzamma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SurahAdapter(private val listSurah: ArrayList<Surah>): RecyclerView.Adapter<SurahAdapter.CardViewViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var surahName: TextView = itemView.findViewById(R.id.surah_name)
        var surahAyat: TextView = itemView.findViewById(R.id.surah_ayat)
        var surahPlace: TextView = itemView.findViewById(R.id.surah_place)
        var btnReadLater: ImageButton = itemView.findViewById(R.id.btn_readLater)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_surah, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSurah.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val surah = listSurah[position]

        holder.surahName.text=surah.name
        holder.surahAyat.text=surah.ayat
        holder.surahPlace.text=surah.place
        holder.btnReadLater.setOnClickListener {  Toast.makeText(holder.itemView.context, "Anda memasukkan " + listSurah[holder.adapterPosition].name + " ke dalam list untuk dibaca nanti", Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener {  onItemClickCallback.onItemClicked(listSurah[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Surah)
    }
}