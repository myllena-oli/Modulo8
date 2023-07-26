package exercicio2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DiaDaSemanaTest{
    @Test
    fun testeDeveRetornarVerdadeiro() {
        val dia1 = 1
        val dia2 = 2
        val dia3 = 3
        val dia4 = 4
        val dia5 = 5
        val dia6 = 6
        val dia7 = 7
        val dia8 = 8
        val dia = DiaDaSemana()

        assertEquals("Domingo", dia.obterNomeDiaDaSemana(dia1))
        assertEquals("Segunda-feira", dia.obterNomeDiaDaSemana(dia2))
        assertEquals("Terça-feira", dia.obterNomeDiaDaSemana(dia3))
        assertEquals("Quarta-feira", dia.obterNomeDiaDaSemana(dia4))
        assertEquals("Quinta-feira", dia.obterNomeDiaDaSemana(dia5))
        assertEquals("Sexta-feira", dia.obterNomeDiaDaSemana(dia6))
        assertEquals("Sábado", dia.obterNomeDiaDaSemana(dia7))
        assertEquals("Valor inválido", dia.obterNomeDiaDaSemana(dia8))
    }
}