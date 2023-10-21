package com.example.appk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.firstP.MenuIIActivity
import com.example.appk.firstP.MenuNIIIActivity
import com.example.appk.firstP.menuActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<View>(R.id.imagen1)
        val imageView2 = findViewById<View>(R.id.imagen2)
        val imageView3 = findViewById<View>(R.id.imagen3)

        imageView1.setOnClickListener {
            val intent = Intent(this, menuActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val intent = Intent(this, MenuIIActivity::class.java)
            startActivity(intent)
        }
        imageView3.setOnClickListener {
            val intent = Intent(this, MenuNIIIActivity::class.java)
            startActivity(intent)
        }
    }
}