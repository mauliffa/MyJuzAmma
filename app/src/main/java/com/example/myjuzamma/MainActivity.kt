package com.example.myjuzamma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMenu1: ImageButton = findViewById(R.id.btn_menu1)
        val btnMenu2: ImageButton = findViewById(R.id.btn_menu2)
        val btnMenu3: ImageButton = findViewById(R.id.btn_menu3)

        btnMenu1.setOnClickListener(this)
        btnMenu2.setOnClickListener(this)
        btnMenu3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_menu1 -> {
                val moveIntent = Intent(this@MainActivity, ListSurahActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_menu2 -> {
                Toast.makeText(this@MainActivity, "Maaf, halaman ini akan tersedia pada bulan April 2021", Toast.LENGTH_LONG).show()
            }
            R.id.btn_menu3 -> {
                Toast.makeText(this@MainActivity, "Maaf, halaman ini akan tersedia pada bulan April 2021", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, MyProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}