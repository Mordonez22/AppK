package com.example.appk.firstP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appk.R

class meAdjetivosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_adjetivos)

        val imageView1 = findViewById<View>(R.id.imagen1)
        val imageView2 = findViewById<View>(R.id.imagen2)

        imageView1.setOnClickListener {
            val intent = Intent(this, ejAdjeActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val intent = Intent(this, auAdverbioActivity::class.java)
            startActivity(intent)
        }
    }
}