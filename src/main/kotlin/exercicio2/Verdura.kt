package exercicio2

class Verdura(nome: String?, quantidade: Double) : Alimento(nome!!, quantidade) {
    override val tipo: String
        get() = "VERDURA"

    fun adicionarVerdura(): Verdura {
        val quantidade: Double
        while (true) {
            print("Informe a quantidade da verdura em quilos com ponto: ")
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
                throw NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.")
            }
        }

        var nome: String
        while (true) {
            try {
                print("Informe o nome da verdura: ")
                nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir nome vazio")
                } else {
                    break
                }
            } catch (e: UnsupportedOperationException) {
                println("Erro UnsupportedOperationException: " + e.message)
            }
        }
        return Verdura(nome, quantidade)
    }
}
