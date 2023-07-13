package exercicio1

import java.util.UUID

//classe abstrata com definição de atributos e métodos e implementação do equals
abstract class Item(val nome: String, val preco: Double, val codigoDeBarras: UUID) {
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Item) return false
        return codigoDeBarras == other.codigoDeBarras
    }

}