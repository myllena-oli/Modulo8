package etapa1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ComprasTest{
    @Test
    fun calcularTotalDeveRetornarTotalCorreto() {
        val compras = Compras()

        val pedidos = listOf("Maçã", "Maçã", "Laranja", "Maçã")
        val total = compras.calcularTotal(pedidos)

        assertEquals(2.05, total)
    }

    @Test
    fun calcularTotalComProdutoDesconhecidoDeveLancarExcecao() {
        val compras = Compras()

        val pedidos = listOf("Maçã", "Maçã", "Laranja", "Banana")
        assertThrows(IllegalArgumentException::class.java) {
            compras.calcularTotal(pedidos)
        }
    }
}