package exercicio2

import kotlin.math.PI

class Circulo(private val raio: Float) : Forma() {
    override fun calcularArea(): Float {
        return PI.toFloat() * raio
    }

    override fun calcularPerimetro(): Float {
        return 2 * PI.toFloat() * raio
    }
}