package exercicio3

open class TimeModelo(private val nome: String, private val jogadores: Int, private val vitorias: Int, private val esporte: String) {
    open fun mostrar() {
        println("Nome do time: $nome")
        println("Número de jogadores: $jogadores")
        println("Número de vitórias em 2022: $vitorias")
        println("Esporte: $esporte\n")
    }
}