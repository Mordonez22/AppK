package com.example.appk.firstP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class MenuIIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_iiactivity)

        val btnFamilia = findViewById<AppCompatButton>(R.id.btnFamilia)
        btnFamilia.setOnClickListener {navigateToFamilia()}

        val btnPronombres = findViewById<AppCompatButton>(R.id.btnNaturalez)
        btnPronombres.setOnClickListener {navigateToNaturaleza()}

        val btnDias = findViewById<AppCompatButton>(R.id.btnNumeros1)
        btnDias.setOnClickListener {navigateToDias()}

        val btnColores = findViewById<AppCompatButton>(R.id.btnCasa)
        btnColores.setOnClickListener {navigateToColores()}

        val btnVerbos = findViewById<AppCompatButton>(R.id.btnEstados)
        btnVerbos.setOnClickListener {navigateToVerbos()}
    }
    private fun navigateToFamilia(){
        val intent = Intent(this, FamiliaActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNaturaleza(){
        val intent = Intent(this, NaturalezaActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToDias(){
        val intent = Intent(this, numerosActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToColores(){
        val intent = Intent(this, casaActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToVerbos(){
        val intent = Intent(this, animoActivity::class.java)
        startActivity(intent)
    }
}