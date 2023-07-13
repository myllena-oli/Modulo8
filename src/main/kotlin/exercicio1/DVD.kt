package exercicio1

import java.util.*

//uso da herança e encapsulamento do atributo duracao
class DVD(nome: String, preco: Double, codigoDeBarras: UUID, private val duracao: String) :
    Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("DVD: $nome, Preço: $preco, Duração: $duracao")
    }
}