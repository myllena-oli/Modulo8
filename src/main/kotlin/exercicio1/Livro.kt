package exercicio1

import java.util.*

//uso da herança e encapsulamento do atributo autor

class Livro(nome: String, preco: Double, codigoDeBarras: UUID, private val autor: String) : Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Livro: $nome, Preço: $preco, Autor: $autor")
    }
}