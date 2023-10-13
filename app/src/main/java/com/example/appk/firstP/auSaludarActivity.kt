package com.example.appk.firstP

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.appk.R

class auSaludarActivity : AppCompatActivity() {
    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_au_saludar)

        val titulo: TextView = findViewById(R.id.questionTextView)
        val audio: TextView = findViewById(R.id.audio)
        val option1RadioButton: RadioButton = findViewById(R.id.option1RadioButton)
        val option2RadioButton: RadioButton = findViewById(R.id.option2RadioButton)
        val option3RadioButton: RadioButton = findViewById(R.id.option3RadioButton)
        val checkButton: Button = findViewById(R.id.checkButton)
        val respuesta: TextView = findViewById(R.id.Respuesta)
        val audio2: TextView = findViewById(R.id.audio2)
        val option1RadioButton2: RadioButton = findViewById(R.id.option1RadioButton2)
        val option2RadioButton2: RadioButton = findViewById(R.id.option2RadioButton2)
        val option3RadioButton2: RadioButton = findViewById(R.id.option3RadioButton2)
        val checkButton2: Button = findViewById(R.id.checkButton2)
        val respuesta2: TextView = findViewById(R.id.Respuesta2)
        val audio3: TextView = findViewById(R.id.audio3)
        val option1RadioButton3: RadioButton = findViewById(R.id.option1RadioButton3)
        val option2RadioButton3: RadioButton = findViewById(R.id.option2RadioButton3)
        val option3RadioButton3: RadioButton = findViewById(R.id.option3RadioButton3)
        val checkButton3: Button = findViewById(R.id.checkButton3)
        val respuesta3: TextView = findViewById(R.id.Respuesta3)


        titulo.text = "Elige la traducción correcta"
        audio.text = "Reproducir Audio"
        option1RadioButton.text = "Buenos días, gracias"
        option2RadioButton.text = "Bien gracias "
        option3RadioButton.text = "¿Cómo estás?"

        audio2.text = "Reproducir Audio"
        option1RadioButton2.text = "Buenas noches"
        option2RadioButton2.text = "Buenos Días"
        option3RadioButton2.text = "Buenas Tardes"

        audio3.text = "Reproducir Audio"
        option1RadioButton3.text = "Bien gracias"
        option2RadioButton3.text = "¡Qué bien!"
        option3RadioButton3.text = "Buenos días, gracias"


        checkButton.setOnClickListener {
            val selectedOptionId = findViewById<RadioGroup>(R.id.optionRadioGroup).checkedRadioButtonId
            val selectedOption: RadioButton = findViewById(selectedOptionId)

            val correctTranslation = "¿Cómo estás?"
            val userTranslation = selectedOption.text.toString()

            if (userTranslation == correctTranslation) {
                // Correct translation logic
                respuesta.text = "Correcto"
            } else {
                // Incorrect translation logic
                respuesta.text = "Incorrecto"
            }
        }

        checkButton2.setOnClickListener {
            val selectedOptionId = findViewById<RadioGroup>(R.id.optionRadioGroup2).checkedRadioButtonId
            val selectedOption: RadioButton = findViewById(selectedOptionId)

            val correctTranslation = "Buenas noches"
            val userTranslation = selectedOption.text.toString()

            if (userTranslation == correctTranslation) {
                // Correct translation logic
                respuesta2.text = "Correcto"
            } else {
                // Incorrect translation logic
                respuesta2.text = "Incorrecto"
            }
        }

        checkButton3.setOnClickListener {
            val selectedOptionId = findViewById<RadioGroup>(R.id.optionRadioGroup3).checkedRadioButtonId
            val selectedOption: RadioButton = findViewById(selectedOptionId)

            val correctTranslation = "¡Qué bien!"
            val userTranslation = selectedOption.text.toString()

            if (userTranslation == correctTranslation) {
                // Correct translation logic
                respuesta3.text = "Correcto"
            } else {
                // Incorrect translation logic
                respuesta3.text = "Incorrecto"
            }
        }

        mediaPlayer1 = MediaPlayer.create(this, R.raw.cmestas)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.bnnoches)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.qbien)

        val Button1: Button = findViewById(R.id.audio)
        Button1.setOnClickListener {
            playSound(mediaPlayer1)
        }
        val Button2: Button = findViewById(R.id.audio2)
        Button2.setOnClickListener {
            playSound(mediaPlayer2)
        }
        val Button3: Button = findViewById(R.id.audio3)
        Button3.setOnClickListener {
            playSound(mediaPlayer3)
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
    }

}