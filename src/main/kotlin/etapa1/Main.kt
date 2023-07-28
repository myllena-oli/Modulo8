package etapa1

fun main() {
    val compras = Compras()

    val pedidos = listOf("Maçã", "Maçã", "Laranja", "Laranja","Laranja")
    val total = compras.calcularTotal(pedidos)
    println("Total: $%.2f\n".format(total))//deve dar 1.95

}
