package exercicio2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Pessoa(private var nome: String) {
    private var diaNascimento: Int = 0
    private var mesNascimento: Int = 0
    private var anoNascimento: Int = 0
    private var idade: Int = 0

    fun calculaIdade() {
        val dataAtual = LocalDate.now()
        val dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento)
        idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual).toInt()
    }

    fun informarIdade(): Int {
        return idade
    }

    fun informarNome(): String {
        return nome
    }

    fun ajustaDataDeNascimento(dia: Int, mes: Int, ano: Int) {
        diaNascimento = dia
        mesNascimento = mes
        anoNascimento = ano
    }
}