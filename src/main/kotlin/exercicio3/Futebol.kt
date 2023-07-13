package exercicio3

class Futebol(nome: String, jogadores: Int, vitorias: Int) : TimeModelo(nome, jogadores, vitorias, "Futebol") {
    override fun mostrar() {
        println("Campeonato: Campeonato Mineiro")
        super.mostrar()
    }
}