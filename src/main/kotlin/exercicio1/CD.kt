package exercicio1

import java.util.UUID

//uso da herança e encapsulamento do atributo númeroDeFaixas
class CD(nome: String, preco: Double, codigoDeBarras: UUID, private val numeroDeFaixas: Int) :
    Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("CD: $nome, Preço: $preco, Número de Faixas: $numeroDeFaixas")
    }
}