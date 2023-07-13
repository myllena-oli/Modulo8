package exercicio6

class ContaCorrente(saldo:Double): ContaBancaria(saldo) {
    override fun depositar(valor: Double, pessoa: Boolean) {
        if (valor <= 5000) {
            saldo += valor
            println("Depósito realizado. ")
            verificarSaldo()

        } else {
            println("Operação inválida, procure a sua agência.")
        }
    }
    override fun sacar(valor: Double) {
        saldo -= valor
        println("Saque realizado. ")
        verificarSaldo()

    }
}