package exercicio2

class Grao(nome: String?, quantidade: Double) : Alimento(nome!!, quantidade) {
    override val tipo: String
        get() = "GRÃOS"

    fun adicionarGrao(): Grao {
        val quantidade: Double
        while (true) {
            print("Informe a quantidade de graos em quilos com ponto: ")
            val quantidadeEmString = readln()
            if (quantidadeEmString.isEmpty()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }
            if (quantidadeEmString.contains("-")) {
                println("Não é possível inserir números negativos!")
                continue
            }
            if (quantidadeEmString.contains(".")) {
                quantidade = quantidadeEmString.toDouble()
                break
            } else {
                throw NumberFormatException("Para grãos, a quantidade deve ser informada com ponto.")
            }
        }
        var nome: String
        while (true) {
            try {
                print("Informe o nome do grão: ")
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
        return Grao(nome, quantidade)
    }
}
