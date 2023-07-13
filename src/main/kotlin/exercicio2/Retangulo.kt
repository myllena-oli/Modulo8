package exercicio2

open class Retangulo(private val lado: Float, private val altura: Float) : Forma() {
    override fun calcularArea(): Float {
        return lado * altura
    }

    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}