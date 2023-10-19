package com.example.appk.firstP

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.appk.R

class numerosActivity : AppCompatActivity() {
    private lateinit var mediaPlayer0: MediaPlayer
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
    private lateinit var mediaPlayer11: MediaPlayer
    private lateinit var mediaPlayer12: MediaPlayer
    private lateinit var mediaPlayer13: MediaPlayer
    private lateinit var mediaPlayer14: MediaPlayer
    private lateinit var mediaPlayer15: MediaPlayer
    private lateinit var mediaPlayer16: MediaPlayer
    private lateinit var mediaPlayer17: MediaPlayer
    private lateinit var mediaPlayer18: MediaPlayer
    private lateinit var mediaPlayer19: MediaPlayer
    private lateinit var mediaPlayer20: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numeros)

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
        val text21 = findViewById<TextView>(R.id.txtS21)
        val text22 = findViewById<TextView>(R.id.txtS22)
        val text23 = findViewById<TextView>(R.id.txtS23)
        val text24 = findViewById<TextView>(R.id.txtS24)
        val text25 = findViewById<TextView>(R.id.txtS25)
        val text26 = findViewById<TextView>(R.id.txtS26)
        val text27 = findViewById<TextView>(R.id.txtS27)
        val text28 = findViewById<TextView>(R.id.txtS28)
        val text29 = findViewById<TextView>(R.id.txtS29)
        val text30 = findViewById<TextView>(R.id.txtS30)
        val text31 = findViewById<TextView>(R.id.txtS31)
        val text32 = findViewById<TextView>(R.id.txtS32)
        val text33 = findViewById<TextView>(R.id.txtS33)
        val text34 = findViewById<TextView>(R.id.txtS34)
        val text35 = findViewById<TextView>(R.id.txtS35)
        val text36 = findViewById<TextView>(R.id.txtS36)
        val text37 = findViewById<TextView>(R.id.txtS37)
        val text38 = findViewById<TextView>(R.id.txtS38)
        val text39 = findViewById<TextView>(R.id.txtS39)
        val text40 = findViewById<TextView>(R.id.txtS40)
        val text41 = findViewById<TextView>(R.id.txtS41)
        val text42 = findViewById<TextView>(R.id.txtS42)


        // Modificar los textos de los TextViews
        titleTextView.text = "NÚMEROS "
        text1.text = "  0"
        text2.text = "  wa’ix"
        text3.text = "  1"
        text4.text = "  jun"
        text5.text = "  2"
        text6.text = "  ka’i’"
        text7.text = "  3"
        text8.text = "  oxi’"
        text9.text = "  4"
        text10.text = "  kaji’"
        text11.text = "  5"
        text12.text = "  wo’o’"
        text13.text = "  6"
        text14.text = "  waqi’"
        text15.text = "  7"
        text16.text = "  wuqu’"
        text17.text = "  8"
        text18.text = "  waqxaqi’"
        text19.text = "  9"
        text20.text = "  b’eleje’"
        text21.text = "  10"
        text22.text = "  lajuj"
        text23.text = "  11"
        text24.text = "  julajuj"
        text25.text = "  12"
        text26.text = "  kab’lajuj"
        text27.text = "  13"
        text28.text = "  oxlajuj"
        text29.text = "  14"
        text30.text = "  kajlajuj"
        text31.text = "  15"
        text32.text = "  wolajuj  "
        text33.text = "  16"
        text34.text = "  waqlajuj"
        text35.text = "  17"
        text36.text = "  wuqlajuj"
        text37.text = "  18"
        text38.text = "  Waqxaqlajuj"
        text39.text = "  19"
        text40.text = "  b'elejlajuj"
        text41.text = "  20"
        text42.text = "  junk'al"

        val btnEjercicioS = findViewById<AppCompatButton>(R.id.btnEjercioS)
        btnEjercicioS.setOnClickListener {navigateToEjercioS()}

        mediaPlayer0 = MediaPlayer.create(this, R.raw.cero)
        mediaPlayer1 = MediaPlayer.create(this, R.raw.uno)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.dos)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.tres)
        mediaPlayer4 = MediaPlayer.create(this, R.raw.cuatro)
        mediaPlayer5 = MediaPlayer.create(this, R.raw.cinco)
        mediaPlayer6 = MediaPlayer.create(this, R.raw.seis)
        mediaPlayer7 = MediaPlayer.create(this, R.raw.siete)
        mediaPlayer8 = MediaPlayer.create(this, R.raw.ocho)
        mediaPlayer9 = MediaPlayer.create(this, R.raw.nueve)
        mediaPlayer10 = MediaPlayer.create(this, R.raw.diez)
        mediaPlayer11 = MediaPlayer.create(this, R.raw.once)
        mediaPlayer12 = MediaPlayer.create(this, R.raw.doce)
        mediaPlayer13 = MediaPlayer.create(this, R.raw.trece)
        mediaPlayer14 = MediaPlayer.create(this, R.raw.catorce)
        mediaPlayer15 = MediaPlayer.create(this, R.raw.quince)
        mediaPlayer16 = MediaPlayer.create(this, R.raw.dieciseis)
        mediaPlayer17 = MediaPlayer.create(this, R.raw.diecisiete)
        mediaPlayer18 = MediaPlayer.create(this, R.raw.dieciocho)
        mediaPlayer19 = MediaPlayer.create(this, R.raw.diecinueve)
        mediaPlayer20 = MediaPlayer.create(this, R.raw.veinte)



        val imageButton1: ImageButton = findViewById(R.id.btnA1)
        imageButton1.setOnClickListener {
            playSound(mediaPlayer0)
        }
        val imageButton2: ImageButton = findViewById(R.id.btnA2)
        imageButton2.setOnClickListener {
            playSound(mediaPlayer1)
        }
        val imageButton3: ImageButton = findViewById(R.id.btnA3)
        imageButton3.setOnClickListener {
            playSound(mediaPlayer2)
        }
        val imageButton4: ImageButton = findViewById(R.id.btnA4)
        imageButton4.setOnClickListener {
            playSound(mediaPlayer3)
        }
        val imageButton5: ImageButton = findViewById(R.id.btnA5)
        imageButton5.setOnClickListener {
            playSound(mediaPlayer4)
        }
        val imageButton6: ImageButton = findViewById(R.id.btnA6)
        imageButton6.setOnClickListener {
            playSound(mediaPlayer5)
        }
        val imageButton7: ImageButton = findViewById(R.id.btnA7)
        imageButton7.setOnClickListener {
            playSound(mediaPlayer6)
        }
        val imageButton8: ImageButton = findViewById(R.id.btnA8)
        imageButton8.setOnClickListener {
            playSound(mediaPlayer7)
        }
        val imageButton9: ImageButton = findViewById(R.id.btnA9)
        imageButton9.setOnClickListener {
            playSound(mediaPlayer8)
        }
        val imageButton10: ImageButton = findViewById(R.id.btnA10)
        imageButton10.setOnClickListener {
            playSound(mediaPlayer9)
        }
        val imageButton11: ImageButton = findViewById(R.id.btnA11)
        imageButton11.setOnClickListener {
            playSound(mediaPlayer10)
        }
        val imageButton12: ImageButton = findViewById(R.id.btnA12)
        imageButton12.setOnClickListener {
            playSound(mediaPlayer11)
        }
        val imageButton13: ImageButton = findViewById(R.id.btnA13)
        imageButton13.setOnClickListener {
            playSound(mediaPlayer12)
        }
        val imageButton14: ImageButton = findViewById(R.id.btnA14)
        imageButton14.setOnClickListener {
            playSound(mediaPlayer13)
        }
        val imageButton15: ImageButton = findViewById(R.id.btnA15)
        imageButton15.setOnClickListener {
            playSound(mediaPlayer14)
        }
        val imageButton16: ImageButton = findViewById(R.id.btnA16)
        imageButton16.setOnClickListener {
            playSound(mediaPlayer15)
        }
        val imageButton17: ImageButton = findViewById(R.id.btnA17)
        imageButton17.setOnClickListener {
            playSound(mediaPlayer16)
        }
        val imageButton18: ImageButton = findViewById(R.id.btnA18)
        imageButton18.setOnClickListener {
            playSound(mediaPlayer17)
        }
        val imageButton19: ImageButton = findViewById(R.id.btnA19)
        imageButton19.setOnClickListener {
            playSound(mediaPlayer18)
        }
        val imageButton20: ImageButton = findViewById(R.id.btnA20)
        imageButton20.setOnClickListener {
            playSound(mediaPlayer19)
        }
        val imageButton21: ImageButton = findViewById(R.id.btnA21)
        imageButton21.setOnClickListener {
            playSound(mediaPlayer20)
        }
    }
    private fun playSound(mediaPlayer: MediaPlayer) {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer0.release()
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
        mediaPlayer11.release()
        mediaPlayer12.release()
        mediaPlayer13.release()
        mediaPlayer14.release()
        mediaPlayer15.release()
        mediaPlayer16.release()
        mediaPlayer17.release()
        mediaPlayer18.release()
        mediaPlayer19.release()
        mediaPlayer20.release()
    }
    private fun navigateToEjercioS(){
        val intent = Intent(this, meNumerosActivity::class.java)
        startActivity(intent)
    }
}