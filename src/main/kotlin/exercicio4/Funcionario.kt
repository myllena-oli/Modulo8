package exercicio4

import java.time.LocalDate

open class Funcionario (private val nome: String, private val setor: String, private val salario: Double, private val dataAdmissao: LocalDate) {
    open fun mostrar() {
        println("Nome: $nome")
        println("Setor: $setor")
        println("Salário: %.2f".format(salario))
        println("Data de admissão: $dataAdmissao")
    }
}