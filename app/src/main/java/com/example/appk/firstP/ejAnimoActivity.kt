package com.example.appk.firstP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.appk.R

class ejAnimoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej_animo)

        val titulo: TextView = findViewById(R.id.questionTextView)
        val palabras: TextView = findViewById(R.id.palabra)
        val option1RadioButton: RadioButton = findViewById(R.id.option1RadioButton)
        val option2RadioButton: RadioButton = findViewById(R.id.option2RadioButton)
        val option3RadioButton: RadioButton = findViewById(R.id.option3RadioButton)
        val checkButton: Button = findViewById(R.id.checkButton)
        val respuesta: TextView = findViewById(R.id.Respuesta)
        val palabras2: TextView = findViewById(R.id.palabra2)
        val option1RadioButton2: RadioButton = findViewById(R.id.option1RadioButton2)
        val option2RadioButton2: RadioButton = findViewById(R.id.option2RadioButton2)
        val option3RadioButton2: RadioButton = findViewById(R.id.option3RadioButton2)
        val checkButton2: Button = findViewById(R.id.checkButton2)
        val respuesta2: TextView = findViewById(R.id.Respuesta2)
        val palabras3: TextView = findViewById(R.id.palabra3)
        val option1RadioButton3: RadioButton = findViewById(R.id.option1RadioButton3)
        val option2RadioButton3: RadioButton = findViewById(R.id.option2RadioButton3)
        val option3RadioButton3: RadioButton = findViewById(R.id.option3RadioButton3)
        val checkButton3: Button = findViewById(R.id.checkButton3)
        val respuesta3: TextView = findViewById(R.id.Respuesta3)


        titulo.text = "Elige la traducción correcta"
        palabras.text = "Estoy feliz"
        option1RadioButton.text = "yikikot"
        option2RadioButton.text = "yitoq’"
        option3RadioButton.text = "Wiq'ij"

        palabras2.text = "Estoy triste"
        option1RadioButton2.text = "Rox q'ij"
        option2RadioButton2.text = "yinojin"
        option3RadioButton2.text = "yib’ison"

        palabras3.text = "Estoy enojado"
        option1RadioButton3.text = "k’o nuwaran"
        option2RadioButton3.text = "k’o woyowal"
        option3RadioButton3.text = "okib’äl"

        checkButton.setOnClickListener {
            val selectedOptionId = findViewById<RadioGroup>(R.id.optionRadioGroup).checkedRadioButtonId
            val selectedOption: RadioButton = findViewById(selectedOptionId)

            val correctTranslation = "yikikot"
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

            val correctTranslation = "yib’ison"
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

            val correctTranslation = "k’o woyowal"
            val userTranslation = selectedOption.text.toString()

            if (userTranslation == correctTranslation) {
                // Correct translation logic
                respuesta3.text = "Correcto"
            } else {
                // Incorrect translation logic
                respuesta3.text = "Incorrecto"
            }
        }
    }
}