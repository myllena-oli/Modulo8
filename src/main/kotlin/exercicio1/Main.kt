package exercicio1

fun main() {
    val produto = ProdutoMaisBarato()
    println("Digite o preço do primeiro produto:")
    val produto1 = readln().toDoubleOrNull() ?: 0.0

    println("Digite o preço do segundo produto:")
    val produto2 = readln().toDoubleOrNull() ?: 0.0

    println("Digite o preço do terceiro produto:")
    val produto3 = readln().toDoubleOrNull() ?: 0.0


    val produtoMaisBarato = produto.encontrarProdutoMaisBarato(produto1, produto2, produto3)
    println("Você deve comprar o Produto $produtoMaisBarato.")
}