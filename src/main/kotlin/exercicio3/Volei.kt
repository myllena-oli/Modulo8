package exercicio3

class Volei(nome: String, jogadores: Int, vitorias: Int) : TimeModelo(nome, jogadores, vitorias, "Volei") {
    override fun mostrar() {
        println("Campeonato: Superliga Feminina de Vôlei")
        super.mostrar()
    }
}