package exercicio1

fun main() {

    val caixa = Caixa()

    val produto1 = Produto("Camisa", 29.90, 10)
    val produto2 = Produto("Calca", 89.90, 5)
    val produto3 = Produto("Camiseta", 79.90, 5)
    val produto4 = Produto("Boné", 39.90, 5)
    val produto5 = Produto("Sapato", 99.90, 10)

    caixa.cadastrarProdutos(produto1)
    caixa.cadastrarProdutos(produto2)
    caixa.cadastrarProdutos(produto3)
    caixa.cadastrarProdutos(produto4)
    caixa.cadastrarProdutos(produto5)


    while (true) {
        println("Bem Vindo! Digite: 1 - Funcionário\t2 - Cliente\t3 - Sair")
        val entrada = readln().toIntOrNull()
        if (entrada == 1) {
            while (true) {
                println("\nMenu:\n1 - Cadastrar Produto\n2 - Exibir Produtos\n3 - Voltar")
                when (readln().toIntOrNull()) {
                    1 -> caixa.recebeInputsCadastro()
                    2 -> caixa.exibirProdutosCadastrados()
                    3 -> break
                    else -> println("Digite uma opção válida!")
                }
            }
        } else if (entrada == 2) {
            if (caixa.produtosCompra.isNotEmpty()) {
                while (true) {
                    println("\nDeseja: \n1 - Continuar a sessão\n2 - Entrar como um novo cliente")
                    when (readln().toIntOrNull()) {
                        1 -> break
                        2 -> {
                            caixa.produtosCompra.clear()
                            break
                        }

                        else -> println("Digite uma opção válida!")
                    }
                }
            }
            while (true) {
                println("\nMenu:\n1 - Adicionar no carrinho\n2 - Exibir Valor Total\n3 - Voltar")
                when (readln().toIntOrNull()) {
                    1 -> caixa.adicionarCarrinho()
                    2 -> caixa.valorTotal()
                    3 -> break
                    else -> println("Digite uma opção válida!")
                }
            }

        } else if (entrada == 3) {
            break
        } else {
            println("Digite uma opção válida!")
        }
    }
}