package exercicio5

open class Animal(private val nome: String, private val raca: String, private val responsavel: String) {
    open fun mover() {
    }

    open fun comer() {
    }

    open fun dormir() {
    }

    open fun acoes() {
        println("Nome: $nome\t\tRaça: $raca\t\tResponsável: $responsavel")
        mover()
        comer()
        dormir()
        println()
    }
}