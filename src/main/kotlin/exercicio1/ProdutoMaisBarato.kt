package exercicio1

class ProdutoMaisBarato {

    fun encontrarProdutoMaisBarato(preco1: Double, preco2: Double, preco3: Double): Int {
        return when {
            preco1 <= preco2 && preco1 <= preco3 -> 1
            preco2 <= preco1 && preco2 <= preco3 -> 2
            else -> 3
        }
    }
}