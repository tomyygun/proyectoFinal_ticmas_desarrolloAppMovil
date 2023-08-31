package com.example.appdelaspalabrasiguales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var botonComparar: Button
    private lateinit var resultadoTextView: TextView

    private fun compareTexts(text1: String, text2: String): String {
        return if (text1 == text2) {
            "Los textos son iguales!!"
        } else {
            "Los textos no son iguales :("
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        botonComparar = findViewById(R.id.botonComparar)
        resultadoTextView = findViewById(R.id.resultadoTextView)

        botonComparar.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            val resultado = compareTexts(text1,text2)
            resultadoTextView.text= resultado
        }
    }


}


