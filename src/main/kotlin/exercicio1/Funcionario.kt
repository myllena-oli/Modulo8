package exercicio1

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Int = 0
    var valorPorHora: Double = 0.0

    fun nomeCompleto() {
        println("$nome $sobrenome")
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorPorHora
        println("Salário: R$%.2f".format(salario))
    }

    fun incrementarHoras(valor: Int) {
        horasTrabalhadas += valor
    }
}