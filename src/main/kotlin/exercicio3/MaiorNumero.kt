package exercicio3

class MaiorNumero {

    fun encontrarMaiorNumero(numeros: List<Double>): Double {
        return numeros.maxOrNull() ?: throw IllegalArgumentException("A lista está vazia.")
    }

}