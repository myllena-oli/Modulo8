package etapa2


fun main() {
    val compras = Compras()
    val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")
    val totalOferta = compras.ofertaSimples(pedidos)
    println("Total: $%.2f\n".format(totalOferta)) // deve dar 1.10
}
