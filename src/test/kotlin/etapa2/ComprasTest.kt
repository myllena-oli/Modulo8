package etapa2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ComprasTest {

    @Test
    fun calcularTotalComPromocaoAplicada() {
        val compras = Compras()

        val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")
        val total = compras.ofertaSimples(pedidos)

        assertEquals(1.10, total)
    }

}