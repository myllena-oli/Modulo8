package etapa3

class Pedido(val produtos: List<String>, val total: Double) {
    fun notificarCliente() {
        println("Pedido realizado com sucesso!")
        println("Produtos: ${produtos.joinToString(", ")}")
        println("Total: $%.2f".format(total))
        println("Tempo estimado de entrega: 5 horas\n\n")
    }
}