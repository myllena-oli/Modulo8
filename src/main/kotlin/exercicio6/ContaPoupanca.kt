package exercicio6

class ContaPoupanca: ContaBancaria(0.0) {
    override fun depositar(valor: Double, pessoa: Boolean) {
        if (pessoa) {
            saldo += valor
            println("Depósito realizado. ")
            verificarSaldo()
        } else {
            println("Conta Salário só pode receber depósito do usuário")
        }
    }
}