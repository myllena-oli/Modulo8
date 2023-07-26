package exercicio2

fun main() {
    val dia = DiaDaSemana()
    print("Digite um número correspondente ao dia da semana de 1 a 7: ")
    val numero = readln().toIntOrNull() ?: 0
    println(dia.obterNomeDiaDaSemana(numero))

}
