package exercicio5

import kotlin.system.exitProcess

fun main(){
    val turma = Turma()

    println("===Bem Vindo===")
    while (true){
        println("\nDigite:\n1 - Cadastrar aluno\n2 - Listar alunos\n3 - Listar alunos por sobrenome" +
                "\n4 - Listar aluno mais velho\n5 - Lista média de idades\n6 - Atualizar dados de aluno" +
                "\n7 - Remover aluno\n8 - Sair")
        when(readln().toIntOrNull()){
            1-> turma.organizaCadastro()
            2-> turma.listarAlunos()
            3-> {
                println("Digite o sobrenome: ")
                turma.listarAlunosSobrenome(readln())
            }
            4-> turma.alunoMaisVelho()
            5-> turma.mediaIdades()
            6-> turma.atualizarDados()
            7-> turma.removerAluno()
            8 -> exitProcess(0)
            else -> println("Opção inválida!")
        }
    }
}