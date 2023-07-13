package exercicio5

class Peixe(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun mover() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun dormir() {
        println("Dormindo de olho aberto")
    }
}