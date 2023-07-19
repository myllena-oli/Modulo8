package exercicio2

import java.util.*

class Outro(nome: String?, quantidade: Double) : Alimento(nome!!, quantidade) {
    override val tipo: String
        get() = "OUTROS"

    fun adicionarOutros(): Outro {
        var quantidade: Int
        while (true) {
            try {
                print("Informe a quantidade de outros em unidade: ")
                quantidade = readln().toInt()
                if (quantidade == 0) {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio")
                }
                if (quantidade < 0) {
                    println("Não é possível inserir números negativos!")
                } else {
                    break
                }
            } catch (e: InputMismatchException) {
                throw NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras.")
            }
        }
        var nome: String
        while (true) {
            try {
                print("Informe o nome do 'outros': ")
                nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir nome vazio")
                } else {
                    break
                }
            } catch (e: UnsupportedOperationException) {
                println("Erro NumberFormatException: " + e.message)
            }
        }
        return Outro(nome, quantidade.toDouble())
    }
}
