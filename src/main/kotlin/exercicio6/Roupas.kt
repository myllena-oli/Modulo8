package exercicio6

class Roupas(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Peça $marca $modelo retirada.")
    }
}