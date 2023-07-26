package exercicio3

fun main() {
    val maior = MaiorNumero()
    val numeros = mutableListOf<Double>()
    for (i in 1..5) {
        print("Digite o $i º número: ")
        numeros.add(readln().toDoubleOrNull() ?: 0.0)
    }

    val maiorNumero = maior.encontrarMaiorNumero(numeros)
    println("O maior número é: $maiorNumero")
}