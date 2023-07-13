package exercicio2

fun main() {
    val formas = arrayOf(Circulo(2f), Retangulo(1f, 2f), Quadrado(4f), Circulo(3f), Retangulo(6f, 2f))

    for (forma in formas) {
        when (forma) {
            is Quadrado -> {
                println("Quadrado: ")
            }

            is Circulo -> {
                println("Círculo: ")
            }

            is Retangulo -> {
                println("Retângulo: ")
            }
        }
        println("Área: ${forma.calcularArea()}")
        println("Perímetro: ${forma.calcularPerimetro()}\n")
    }

}