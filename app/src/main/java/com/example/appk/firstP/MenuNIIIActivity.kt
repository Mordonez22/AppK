package com.example.appk.firstP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class MenuNIIIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_niiiactivity)

        val btnFamilia = findViewById<AppCompatButton>(R.id.btnMedios)
        btnFamilia.setOnClickListener {navigateToFamilia()}

        val btnPronombres = findViewById<AppCompatButton>(R.id.btnProfesiones)
        btnPronombres.setOnClickListener {navigateToNaturaleza()}

        val btnDias = findViewById<AppCompatButton>(R.id.btnAdverbios)
        btnDias.setOnClickListener {navigateToDias()}

        val btnColores = findViewById<AppCompatButton>(R.id.btnAdjetivos)
        btnColores.setOnClickListener {navigateToColores()}

        val btnVerbos = findViewById<AppCompatButton>(R.id.btnNumeros2)
        btnVerbos.setOnClickListener {navigateToVerbos()}
    }
    private fun navigateToFamilia(){
        val intent = Intent(this, MediosActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNaturaleza(){
        val intent = Intent(this, profesionesActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToDias(){
        val intent = Intent(this, AdverbiosActivity::class.java)
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