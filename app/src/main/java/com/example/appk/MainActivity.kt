package com.example.appk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.firstP.MenuIIActivity
import com.example.appk.firstP.MenuNIIIActivity
import com.example.appk.firstP.menuActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nivel1 = findViewById<AppCompatButton>(R.id.btnNivel1)
        nivel1.setOnClickListener {navigateToNivel1()}
        val nivel2 = findViewById<AppCompatButton>(R.id.btnNivel2)
        nivel2.setOnClickListener {navigateToNivel2()}
        val nivel3 = findViewById<AppCompatButton>(R.id.btnNivel3)
        nivel3.setOnClickListener {navigateToNivel3()}
    }
    private fun navigateToNivel1(){
        val intent = Intent(this, menuActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNivel2(){
        val intent = Intent(this, MenuIIActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNivel3(){
        val intent = Intent(this, MenuNIIIActivity::class.java)
        startActivity(intent)
    }
}