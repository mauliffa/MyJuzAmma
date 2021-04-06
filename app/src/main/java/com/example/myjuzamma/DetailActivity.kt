package com.example.myjuzamma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PICT = "extra_pict"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_MEANING = "extra_meaning"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailPhoto: ImageView = findViewById(R.id.detail_pict)
        val detailName: TextView = findViewById(R.id.detail_nama)
        val detailMeaning: TextView = findViewById(R.id.detail_arti)

        val name=intent.getStringExtra(EXTRA_NAME)
        val meaning = intent.getStringExtra(EXTRA_MEANING)
        val pict = intent.getIntExtra(EXTRA_PICT, 0)

        detailName.text=name
        detailMeaning.text=meaning
        detailPhoto.setImageResource(pict)
    }
}