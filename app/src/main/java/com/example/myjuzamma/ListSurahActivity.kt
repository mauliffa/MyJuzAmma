package com.example.myjuzamma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListSurahActivity : AppCompatActivity() {
    private lateinit var rvSurah: RecyclerView
    private var list: ArrayList<Surah> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_surah)

        rvSurah = findViewById(R.id.rv_surah)
        rvSurah.setHasFixedSize(true)

        list.addAll(SurahData.listData)
        showSurahList()
    }

    private fun showSurahList(){
        rvSurah.layoutManager=LinearLayoutManager(this)
        val surahAdapter = SurahAdapter(list)
        rvSurah.adapter = surahAdapter

        surahAdapter.setOnItemClickCallback(object : SurahAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Surah) {
                showSelectedSurah(data)
            }
        })
    }

    private fun showSelectedSurah(surah: Surah) {
        val name= surah.name
        val meaning=surah.meaning
        val pict=surah.pict

        val moveWithDataIntent = Intent(this, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_MEANING, meaning)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_PICT, pict)
        startActivity(moveWithDataIntent)
        Toast.makeText(this, "Kamu memilih " + surah.name, Toast.LENGTH_SHORT).show()
    }
}