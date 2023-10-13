package com.example.appk.firstP

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class pronombresActivity : AppCompatActivity() {
    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer
    private lateinit var mediaPlayer4: MediaPlayer
    private lateinit var mediaPlayer5: MediaPlayer
    private lateinit var mediaPlayer6: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pronombres)

        val titleTextView = findViewById<TextView>(R.id.txtTitulo)
        val text1 = findViewById<TextView>(R.id.txtS1)
        val text2 = findViewById<TextView>(R.id.txtS2)
        val text3 = findViewById<TextView>(R.id.txtS3)
        val text4 = findViewById<TextView>(R.id.txtS4)
        val text5 = findViewById<TextView>(R.id.txtS5)
        val text6 = findViewById<TextView>(R.id.txtS6)
        val text7 = findViewById<TextView>(R.id.txtS7)
        val text8 = findViewById<TextView>(R.id.txtS8)
        val text9 = findViewById<TextView>(R.id.txtS9)
        val text10 = findViewById<TextView>(R.id.txtS10)
        val text11 = findViewById<TextView>(R.id.txtS11)
        val text12 = findViewById<TextView>(R.id.txtS12)

        // Modificar los textos de los TextViews
        titleTextView.text = "PRONOMBRES"
        text1.text = "Yo"
        text2.text = "  Rïn"
        text3.text = "Tú"
        text4.text = "  Rat"
        text5.text = "Él y ella"
        text6.text = "  Rija’"
        text7.text = "Nosotros"
        text8.text = "  Röj’"
        text9.text = "Él y ella"
        text10.text = "  Rïx"
        text11.text = "Ustedes"
        text12.text = "  Rije’"

        val btnEjercicioS = findViewById<AppCompatButton>(R.id.btnEjercioS)
        btnEjercicioS.setOnClickListener {navigateToEjercioS()}


        mediaPlayer1 = MediaPlayer.create(this, R.raw.yo)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.tu)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.el)
        mediaPlayer4 = MediaPlayer.create(this, R.raw.nosotros)
        mediaPlayer5 = MediaPlayer.create(this, R.raw.ustedes)
        mediaPlayer6 = MediaPlayer.create(this, R.raw.ellos)
        val imageButton1: ImageButton = findViewById(R.id.btnA1)
        imageButton1.setOnClickListener {
            playSound(mediaPlayer1)
        }
        val imageButton2: ImageButton = findViewById(R.id.btnA2)
        imageButton2.setOnClickListener {
            playSound(mediaPlayer2)
        }
        val imageButton3: ImageButton = findViewById(R.id.btnA3)
        imageButton3.setOnClickListener {
            playSound(mediaPlayer3)
        }
        val imageButton4: ImageButton = findViewById(R.id.btnA4)
        imageButton4.setOnClickListener {
            playSound(mediaPlayer4)
        }
        val imageButton5: ImageButton = findViewById(R.id.btnA5)
        imageButton5.setOnClickListener {
            playSound(mediaPlayer5)
        }
        val imageButton6: ImageButton = findViewById(R.id.btnA6)
        imageButton6.setOnClickListener {
            playSound(mediaPlayer6)
        }
    }
    private fun playSound(mediaPlayer: MediaPlayer) {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer1.release()
        mediaPlayer2.release()
        mediaPlayer3.release()
        mediaPlayer4.release()
        mediaPlayer5.release()
        mediaPlayer6.release()
    }
    private fun navigateToEjercioS(){
        val intent = Intent(this, meEjPronombresActivity::class.java)
        startActivity(intent)
    }
}