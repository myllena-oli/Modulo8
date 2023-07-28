package etapa3

fun main() {
    val compras = Compras()

    val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")

    val notificarOferta = compras.realizarPedidoOferta(pedidos)
    notificarOferta.notificarCliente()



}
