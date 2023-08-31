package com.example.appdelaspalabrasiguales
import org.junit.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun testCompareTexts() {
        val text1 = "hola"
        val text2 = "hola"

        val resultado = compareTexts(text1, text2)
        val resultadoEsperado = "Los textos son iguales"
        assertEquals(resultadoEsperado, resultado)
    }

    fun compareTexts(text1: String, text2: String): String {
        return if (text1 == text2) {
            "Los textos son iguales"
        } else {
            "Los textos no son iguales"
        }
    }
}
