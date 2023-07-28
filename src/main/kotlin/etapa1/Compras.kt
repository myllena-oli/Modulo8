package etapa1

class Compras {
    private val precos = mapOf("Maçã" to 0.60, "Laranja" to 0.25)

    fun calcularTotal(pedidos: List<String>): Double {
        var total = 0.0
        for (produto in pedidos) {
            total += precos[produto] ?: throw IllegalArgumentException("Produto desconhecido: $produto")
        }
        return total
    }
}



