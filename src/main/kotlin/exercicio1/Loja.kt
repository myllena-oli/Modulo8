package exercicio1

import java.util.*

class Loja {
    fun loja() {
        val codigoTeste = UUID.randomUUID()
        val produtos = arrayOf(
            Livro("Harry Potter e a Pedra Filosofal", 29.99, codigoTeste, "J. K. Rowling"),
            CD("Depois do Fim", 39.99, UUID.randomUUID(), 13),
            DVD("This is Us", 19.99, UUID.randomUUID(), "92"),
            Livro("Mau Começo", 19.99, UUID.randomUUID(), "Daniel Handler"),
            CD("Purpose", 35.00, UUID.randomUUID(), 19)
        )

        for (produto in produtos) {
            produto.mostrarDetalhesDoItem()
            println()
        }

        val produto1 = Livro("Harry Potter e a Pedra Filosofal", 29.99, codigoTeste, "J. K. Rowling")
        val produto2 = Livro("Harry Potter e a Pedra Filosofal", 29.99, UUID.randomUUID(), "J. K. Rowling")

        procurar(produto1, produtos)
        procurar(produto2, produtos)

    }

    private fun procurar(produto: Item, produtos: Array<Item>) {
        for((i, item) in produtos.withIndex()){
            if (item == produto) {
                println("O produto ${item.nome} está na posição $i do vetor.")
                return
            }
        }
        println("O produto não foi encontrado.")
    }

}

//fun main() {
//    val loja = Loja()
//    loja.main()
//}