package com.example.appk.firstP

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class numeroIIActivity : AppCompatActivity() {
    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer
    private lateinit var mediaPlayer4: MediaPlayer
    private lateinit var mediaPlayer5: MediaPlayer
    private lateinit var mediaPlayer6: MediaPlayer
    private lateinit var mediaPlayer7: MediaPlayer
    private lateinit var mediaPlayer8: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numero_iiactivity)

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


        // Modificar los textos de los TextViews
        titleTextView.text = "NUMEROS II "
        text1.text = "  30"
        text2.text = "  Junk’alLajuj"
        text3.text = "  40"
        text4.text = " K’ak’al"
        text5.text = "  50"
        text6.text = "  K’ak’alLajuj"
        text7.text = "  60"
        text8.text = "  Oxk’al"
        text9.text = "  70"
        text10.text = "  Oxk’alLajuj"
        text11.text = "  80"
        text12.text = "  Kajk’al"
        text13.text = "  90"
        text14.text = "  Kajk’alLajuj"
        text15.text = "  100"
        text16.text = "  Wok’al"



        val btnEjercicioS = findViewById<AppCompatButton>(R.id.btnEjercioS)
        btnEjercicioS.setOnClickListener {navigateToEjercioS()}


        mediaPlayer1 = MediaPlayer.create(this, R.raw.treinta)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.cuarenta)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.cincuenta)
        mediaPlayer4 = MediaPlayer.create(this, R.raw.sesenta)
        mediaPlayer5 = MediaPlayer.create(this, R.raw.setenta)
        mediaPlayer6 = MediaPlayer.create(this, R.raw.ochenta)
        mediaPlayer7 = MediaPlayer.create(this, R.raw.noventa)
        mediaPlayer8 = MediaPlayer.create(this, R.raw.cien)


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
    }
    private fun navigateToEjercioS(){
        val intent = Intent(this, meProfesionesActivity::class.java)
        startActivity(intent)
    }
}