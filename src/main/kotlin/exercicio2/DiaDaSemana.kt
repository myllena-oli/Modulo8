package exercicio2

class DiaDaSemana {

    fun obterNomeDiaDaSemana(dia: Int): String {
        return when (dia) {
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            7 -> "Sábado"
            else -> "Valor inválido"
        }
    }
}