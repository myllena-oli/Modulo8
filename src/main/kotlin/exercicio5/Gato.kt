package exercicio5

class Gato(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun mover() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}