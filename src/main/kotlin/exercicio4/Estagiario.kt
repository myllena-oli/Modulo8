package exercicio4

import java.time.LocalDate

class Estagiario(nome: String, setor: String, salario: Double, dataAdmissao: LocalDate) :
    Funcionario(nome, setor, salario, dataAdmissao) {
    override fun mostrar() {
        println("Tipo de funcionário: Estagiário")
        super.mostrar()
    }
}