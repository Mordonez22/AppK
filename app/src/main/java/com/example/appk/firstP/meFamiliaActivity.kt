package com.example.appk.firstP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appk.R

class meFamiliaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_familia)

        val imageView1 = findViewById<View>(R.id.imagen1)
        val imageView2 = findViewById<View>(R.id.imagen2)

        imageView1.setOnClickListener {
            val intent = Intent(this, ejFamiliaActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val intent = Intent(this, auFamiliaActivity::class.java)
            startActivity(intent)
        }
    }
}