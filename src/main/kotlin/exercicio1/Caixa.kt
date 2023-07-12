package exercicio1

data class Produto(val nome: String, val valor: Double, var quantidade: Int)
data class Compra(val item: Produto, val quant: Int)

class Caixa {
    var produtosCompra = ArrayList<Compra>()
    private val produtos = ArrayList<Produto>()

    fun cadastrarProdutos(produto: Produto) {
        produtos.add(produto)
    }

    fun recebeInputsCadastro() {
        var nome: String
        var valor: Double
        var quantidade: Int
        while (true) {
            println("Digite o nome do produto: ")
            nome = readln()
            if (nome == "") {
                continue
            }
            break
        }
        while (true) {
            println("Digite o valor do produto: ")
            valor = readln().toDoubleOrNull() ?: continue
            if (valor<=0){
                println("Digite um valor válido!")
                continue
            }
            break
        }
        while (true) {
            println("Digite a quantidade do produto: ")
            quantidade = readln().toIntOrNull() ?: continue
            if (quantidade<=0){
                println("Digite uma quantidade válida!")
                continue
            }
            break
        }
        cadastrarProdutos(Produto(nome, valor, quantidade))
    }

    fun exibirProdutosCadastrados() {
        println("Produtos: ")
        for (produto in produtos) {
            println("Nome: ${produto.nome}\nValor: R$%.2f\nQuantidade: ${produto.quantidade}\n".format(produto.valor))
        }
        if (produtos.isEmpty()) {
            println("Não há produtos disponíveis.")
        }
    }

    fun adicionarCarrinho() {
        var produtoEscolhido = Produto("", 0.0, 0)
        var quantidade: Int
        exibirProdutosCadastrados()
        println("Digite o nome do produto desejado: ")
        val nome = readln()
        for (produto in produtos) {
            if (nome.lowercase() == produto.nome.lowercase()) {
                produtoEscolhido = produto
            }
        }
        if (produtoEscolhido.nome == "") {
            println("Produto não encontrado.\n")
        } else {
            while (true) {
                if (produtoEscolhido.quantidade==0){
                    println("Não há mais itens desse produto!\n")
                }
                println("Digite a quantidade: ")
                quantidade = readln().toIntOrNull() ?: 0
                if (quantidade <= 0 || quantidade>produtoEscolhido.quantidade) {
                    println("Quantidade inválida!\n")
                    continue
                }
                produtoEscolhido.quantidade-=quantidade
                produtosCompra.add(Compra(produtoEscolhido,quantidade))

                break
            }
        }
    }

    fun valorTotal() {
        println("\nValor Total: ")
        var preco = 0.0
        for (compra in produtosCompra) {
            preco+=compra.item.valor*compra.quant
        }
        if (produtosCompra.isEmpty()) {
            println("Não há compras disponíveis.\n")
        }else{
            println("R$%.2f".format(preco))
        }
    }


}