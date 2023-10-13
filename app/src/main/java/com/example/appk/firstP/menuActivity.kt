package com.example.appk.firstP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludos = findViewById<AppCompatButton>(R.id.btnSaludos)
        btnSaludos.setOnClickListener {navigateToSaludos()}

        val btnPronombres = findViewById<AppCompatButton>(R.id.btnPronombres)
        btnPronombres.setOnClickListener {navigateToPronombres()}

        val btnDias = findViewById<AppCompatButton>(R.id.btnDias)
        btnDias.setOnClickListener {navigateToDias()}

        val btnColores = findViewById<AppCompatButton>(R.id.btnColores)
        btnColores.setOnClickListener {navigateToColores()}

        val btnVerbos = findViewById<AppCompatButton>(R.id.btnVerbos)
        btnVerbos.setOnClickListener {navigateToVerbos()}
    }
    private fun navigateToSaludos(){
        val intent = Intent(this, saludosActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToPronombres(){
        val intent = Intent(this, pronombresActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToDias(){
        val intent = Intent(this, DiasActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToColores(){
        val intent = Intent(this, coloresActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToVerbos(){
        val intent = Intent(this, verbosActivity::class.java)
        startActivity(intent)
    }
}