package exercicio2

open class Livro (private val nome: String, private val autor: String, private val genero: String) {
    open fun mostrar() {
        println("Nome: $nome")
        println("Autor: $autor")
        println("Gênero: $genero\n")
    }
}