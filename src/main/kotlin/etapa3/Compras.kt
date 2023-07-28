package etapa3

class Compras {
    private val precos = mapOf("Maçã" to 0.60, "Laranja" to 0.25)

    fun ofertaSimples(pedidos: List<String>): Double {
        val macas = pedidos.count { it == "Maçã" }
        val laranjas = pedidos.count { it == "Laranja" }

        val totalMacas = (macas / 2 + macas % 2) * precos["Maçã"]!!

        val totalLaranjas = ((laranjas / 3) * 2 + laranjas % 3) * precos["Laranja"]!!

        return totalMacas + totalLaranjas
    }

    fun realizarPedidoOferta(pedidos: List<String>): Pedido {
        val total = ofertaSimples(pedidos)
        return Pedido(pedidos, total)
    }
}



