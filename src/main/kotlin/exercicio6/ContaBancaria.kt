package exercicio6

open class ContaBancaria(var saldo: Double) {
    open fun depositar(valor: Double, pessoa: Boolean = false) {
        println("Depósito não suportado para esse tipo de conta.")
    }

    open fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Saque realizado.")
            verificarSaldo()
        } else {
            println("Saldo insuficiente")
        }
    }

    fun verificarSaldo() {
        println("Saldo atual: R$ %.2f".format(saldo))
    }
}