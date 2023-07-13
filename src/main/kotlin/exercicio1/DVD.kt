package exercicio1

import java.util.*

class DVD(nome: String, preco: Double, codigoDeBarras: UUID, private val duracao: String) :
    Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("DVD: $nome, Preço: $preco, Duração: $duracao")
    }
}