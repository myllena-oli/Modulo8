package etapa3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ComprasTest{
    val compras = Compras()
    val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")


    @Test
    fun calcularTotalComPromocaoAplicada() {

        val total = compras.ofertaSimples(pedidos)

        assertEquals(1.10, total)
    }
    @Test
    fun realizarPedidoDeveNotificarCliente() {

        val pedido = compras.realizarPedidoOferta(pedidos)

        assertEquals(pedidos, pedido.produtos)
        assertEquals(1.10, pedido.total, 0.01)
    }
}