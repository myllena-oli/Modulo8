package etapa4

fun main() {
    val compras = Compras()
    try {
    val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")

    val notificarOferta = compras.realizarPedidoOferta(pedidos)
    notificarOferta.notificarCliente()
    } catch (excecao: Exception) {
        println("Erro ao realizar o pedido: ${excecao.message}")
    }
}
