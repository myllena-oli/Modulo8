package exercicio2

fun main() {

    val einstein = Pessoa("Albert Einstein")
    einstein.ajustaDataDeNascimento(14, 3, 1879)
    einstein.calculaIdade()

    val newton = Pessoa("Isaac Newton")
    newton.ajustaDataDeNascimento(4, 1, 1643)
    newton.calculaIdade()

    while (true) {
        println("Menu:\n1 - Calcular idade do Albert Einstein\n2 - Calcular idade do Isaac Newton\n3 - Calcular a sua idade\n4 - Sair")
        when (readln().toIntOrNull()) {
            1 -> println("Idade de ${einstein.informarNome()}: ${einstein.informarIdade()} anos.\n")
            2 -> println("Idade de ${newton.informarNome()}: ${newton.informarIdade()} anos.\n")
            3 -> idadeUsuario()
            4 -> break
            else -> println("Digite uma opção válida!\n")
        }
    }
}

fun idadeUsuario() {
    var nome: String
    val dia: Int
    val mes: Int
    val ano: Int
    while (true) {
        println("Digite o seu nome: ")
        nome = readln()
        if (nome.isEmpty()) {
            nome = "Mr Nobody"
        }
        break
    }
    while (true) {
        println("Dia do Nascimento: ")
        dia = readln().toIntOrNull() ?: continue
        break
    }
    while (true) {
        println("Mês do Nascimento: ")
        mes = readln().toIntOrNull() ?: continue
        break
    }
    while (true) {
        println("Ano do Nascimento: ")
        ano = readln().toIntOrNull() ?: continue
        break
    }
    val usuario = Pessoa(nome)
    usuario.ajustaDataDeNascimento(dia, mes, ano)
    usuario.calculaIdade()
    println("Idade de ${usuario.informarNome()}: ${usuario.informarIdade()} anos.\n")

}