package exercicio5

import java.lang.NumberFormatException
import java.time.DateTimeException
import java.time.LocalDate
import java.time.Period

data class Aluno(var matricula: String, var nome: String, var dataNascimento: LocalDate, var sexo: String)
class Turma {
    private val listaAlunos: MutableSet<Aluno> = mutableSetOf()

    fun organizaCadastro(){
        val aluno = Aluno("","", LocalDate.now(),"")
        var matricula : String


        while (true) {
            println("Digite a matrícula: ")
            matricula = readln()
            if (matricula == "") {
                continue
            }
            break
        }


        val alunoEncontrado = listaAlunos.find { it.matricula == matricula }

        if (alunoEncontrado == null) {
            aluno.matricula = matricula
            mudarNome(aluno)
            mudarNascimento(aluno)
            mudarSexo(aluno)
            listaAlunos.add(aluno)
        } else {
            println("Aluno já cadastrado.")
        }

    }

    fun listarAlunos() {
        if (listaAlunos.isEmpty()) {
            println("Não há alunos cadastrados!")
        } else {
            listaAlunos.forEach { println("\nMatrícula: ${it.matricula}\nNome: ${it.nome}\nData de nascimento: ${it.dataNascimento}\nSexo: ${it.sexo}\n===========================")
            }
        }
    }

    fun listarAlunosSobrenome(sobrenome: String) {

        val alunosFiltrados = listaAlunos.filter { aluno -> aluno.nome.contains(sobrenome) }

        if (alunosFiltrados.isEmpty()) {
            println("Não há alunos cadastrados com esse sobrenome!")
        } else {
            alunosFiltrados.forEach {  println("\nMatrícula: ${it.matricula}\nNome: ${it.nome}\nData de nascimento: ${it.dataNascimento}\nSexo: ${it.sexo}\n===========================")}
        }
    }

    fun alunoMaisVelho() {
        if (listaAlunos.isEmpty()) {
            println("Não há alunos cadastrados!")
        } else {
            val maisVelho = listaAlunos.minBy { it.dataNascimento }
            println("O aluno mais velho é: \nMatrícula: ${maisVelho.matricula}\tNome: ${maisVelho.nome}\tData de nascimento: ${maisVelho.dataNascimento}\tSexo: ${maisVelho.sexo}")
        }
    }

    fun mediaIdades() {
        val idadesSomadas: Int
        if (listaAlunos.isEmpty()) {
            println("Não há alunos cadastrados!")
        } else {
            idadesSomadas = listaAlunos.sumOf { aluno -> Period.between(aluno.dataNascimento, LocalDate.now()).years }
            println("A média é ${idadesSomadas / listaAlunos.size} anos.")
        }
    }

    fun atualizarDados() {
        println("Digite a matrícula do aluno para atualização: ")
        val matriculaSelecionada = readln()
        val alunoSelecionado = listaAlunos.find { it.matricula == matriculaSelecionada }
        if (alunoSelecionado != null) {
            while (true) {
                println("O que deseja mudar?\n1 - Nome\n2 - Data de Nascimento\n3 - Sexo\n4 - Voltar")
                when (readln().toIntOrNull()) {
                    1 -> mudarNome(alunoSelecionado)
                    2 -> mudarNascimento(alunoSelecionado)
                    3 -> mudarSexo(alunoSelecionado)
                    4 -> return
                    else -> println("Opção inválida!")
                }
            }
        }
        else{
            println("Não há alunos cadastrados com essa matrícula!")
        }
    }
    fun removerAluno() {
        println("Digite a matrícula do aluno para atualização: ")
        val matriculaSelecionada = readln()

        val alunoEncontrado = listaAlunos.find { it.matricula == matriculaSelecionada }
        if (alunoEncontrado != null) {
            listaAlunos.remove(alunoEncontrado)
            println("Aluno com matrícula $matriculaSelecionada removido com sucesso.")
        } else {
            println("Aluno com matrícula $matriculaSelecionada não encontrado.")
        }
    }

    private fun mudarNome(alunoSelecionado: Aluno) {
        var nome: String
        while (true) {
            println("Digite o nome: ")
            nome = readln()
            if (nome == "") {
                continue
            }
            break
        }
        alunoSelecionado.nome = nome
    }

    private fun mudarSexo(alunoSelecionado: Aluno) {
        var sexo: String
        while (true) {
            println("Digite o sexo: ")
            sexo = readln()
            if (sexo == "") {
                continue
            }
            break
        }
        alunoSelecionado.sexo = sexo
    }

    private fun mudarNascimento(alunoSelecionado: Aluno) {
        var ano: Int
        var mes: Int
        var dia: Int
        println("Cadastrando data de nascimento...")
        while (true) {
            try {
                println("Digite o dia: ")
                dia = readln().toInt()
                println("Digite o mês: ")
                mes = readln().toInt()
                println("Digite o ano: ")
                ano = readln().toInt()

                if (ano <= 0 || mes <= 0 || dia <= 0) {
                    println("Valor inválido!")
                    continue
                }
                alunoSelecionado.dataNascimento = LocalDate.of(ano, mes, dia)
                break
            } catch (excecao: NumberFormatException) {
                println("Dado inválido! Vamos começar novamente!")
                continue
            } catch (dataErrada: DateTimeException){
                println("Dado inválido! Vamos começar novamente!")
                continue
            }


        }
    }
}

