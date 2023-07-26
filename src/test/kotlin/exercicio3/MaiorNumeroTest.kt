package exercicio3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaiorNumeroTest {
    val maior = MaiorNumero()

    @Test
    fun encontraOMaiorNumero() {
        val numeros1 = listOf(10.0, 5.0, 7.5, 8.0, 6.5)
        val numeros2 = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
        val numeros3 = listOf(5.5, 4.5, 3.5, 2.5, 1.5)

        assertEquals(10.0, maior.encontrarMaiorNumero(numeros1))
        assertEquals(5.0, maior.encontrarMaiorNumero(numeros2))
        assertEquals(5.5, maior.encontrarMaiorNumero(numeros3))
    }

    @Test
    fun deveEntrarNaExcecao() {
        val numerosVazia = mutableListOf<Double>()
        assertThrows(IllegalArgumentException::class.java) {
            maior.encontrarMaiorNumero(numerosVazia)
        }
    }
}