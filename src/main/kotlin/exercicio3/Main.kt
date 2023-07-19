package exercicio3

import kotlin.system.exitProcess

fun main(){
    val dicionario = Dicionario()

    println("===Bem Vindo===")
    while (true){
        println("\nDigite:\n1 - Adicionar termo\n2 - Procurar termo\n3 - Listar termos\n4 - Sair")
        when(readln().toIntOrNull()){
            1-> dicionario.adicionarTermo()
            2-> dicionario.procurarTermo()
            3-> dicionario.listarTermos()
            4 -> exitProcess(0)
            else -> println("Opção inválida!")
        }
    }
}