package exercicio4

import kotlin.system.exitProcess

fun main() {
    val impostoSobreRenda = ImpostoSobreRenda()
    println("===Bem Vindo===")
    while (true) {
        println("\nDigite:\n1 - Cadastrar Dados\n2 - Mostrar informações\n3 - Sair")
        when (readln().toIntOrNull()) {
            1 -> impostoSobreRenda.recebeDados()
            2 -> impostoSobreRenda.mostrarSalarios()
            3 -> exitProcess(0)
            else -> println("Opção inválida!")
        }
    }
}