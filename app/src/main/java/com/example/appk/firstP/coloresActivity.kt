package com.example.appk.firstP

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class coloresActivity : AppCompatActivity() {
    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer
    private lateinit var mediaPlayer4: MediaPlayer
    private lateinit var mediaPlayer5: MediaPlayer
    private lateinit var mediaPlayer6: MediaPlayer
    private lateinit var mediaPlayer7: MediaPlayer
    private lateinit var mediaPlayer8: MediaPlayer
    private lateinit var mediaPlayer9: MediaPlayer
    private lateinit var mediaPlayer10: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colores)

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
        val text13 = findViewById<TextView>(R.id.txtS13)
        val text14 = findViewById<TextView>(R.id.txtS14)
        val text15 = findViewById<TextView>(R.id.txtS15)
        val text16 = findViewById<TextView>(R.id.txtS16)
        val text17 = findViewById<TextView>(R.id.txtS17)
        val text18 = findViewById<TextView>(R.id.txtS18)
        val text19 = findViewById<TextView>(R.id.txtS19)
        val text20 = findViewById<TextView>(R.id.txtS20)

        // Modificar los textos de los TextViews
        titleTextView.text = "COLORES "
        text1.text = "Amarillo"
        text2.text = "  Q’än"
        text3.text = "Anaranjado"
        text4.text = "  Aranxäx"
        text5.text = "Azul"
        text6.text = "  Xar"
        text7.text = "Blanco"
        text8.text = "  Säq"
        text9.text = "Café"
        text10.text = "  K’aqo’j"
        text11.text = "Celeste"
        text12.text = "  Xarxöj"
        text13.text = "Gris"
        text14.text = "  chaj"
        text15.text = "Morado"
        text16.text = "  tuq’"
        text17.text = "Negro"
        text18.text = "  q’ëq"
        text19.text = "Rojo"
        text20.text = "  käq"


        val btnEjercicioS = findViewById<AppCompatButton>(R.id.btnEjercioS)
        btnEjercicioS.setOnClickListener {navigateToEjercioS()}


        mediaPlayer1 = MediaPlayer.create(this, R.raw.amarillo)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.naranja)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.azul)
        mediaPlayer4 = MediaPlayer.create(this, R.raw.blanco)
        mediaPlayer5 = MediaPlayer.create(this, R.raw.cafe)
        mediaPlayer6 = MediaPlayer.create(this, R.raw.celeste)
        mediaPlayer7 = MediaPlayer.create(this, R.raw.gris)
        mediaPlayer8 = MediaPlayer.create(this, R.raw.morado)
        mediaPlayer9 = MediaPlayer.create(this, R.raw.negro)
        mediaPlayer10 = MediaPlayer.create(this, R.raw.rojo)

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
        val imageButton7: ImageButton = findViewById(R.id.btnA7)
        imageButton7.setOnClickListener {
            playSound(mediaPlayer7)
        }
        val imageButton8: ImageButton = findViewById(R.id.btnA8)
        imageButton8.setOnClickListener {
            playSound(mediaPlayer8)
        }
        val imageButton9: ImageButton = findViewById(R.id.btnA9)
        imageButton9.setOnClickListener {
            playSound(mediaPlayer9)
        }
        val imageButton10: ImageButton = findViewById(R.id.btnA10)
        imageButton10.setOnClickListener {
            playSound(mediaPlayer10)
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
        mediaPlayer7.release()
        mediaPlayer8.release()
        mediaPlayer9.release()
        mediaPlayer10.release()
    }
    private fun navigateToEjercioS(){
        val intent = Intent(this, meColoresActivity::class.java)
        startActivity(intent)
    }
}