package exercicio6

fun main() {

    println("==========Conta Salário=========")
    val contaSalario1 = ContaSalario()
    val contaSalario2 = ContaSalario()
    println("Tentativa de deposito sem ser o empregador: ")
    contaSalario1.depositar(1000.0, false)
    println("\nTentativa de saque de 1500 reais: ")
    contaSalario1.sacar(1500.0)
    println("\nTentativa de deposito sendo o empregador: ")
    contaSalario2.depositar(1000.0, true)
    println("\nTentativa de saque de 1500 reais: ")
    contaSalario2.sacar(1500.0)

    println("\n==========Conta Poupança=========")
    val contaPoupanca1 = ContaPoupanca()
    val contaPoupanca2 = ContaPoupanca()
    println("Tentativa de deposito sem ser o usuário: ")
    contaPoupanca1.depositar(1000.0, false)
    println("\nTentativa de saque de 1 real: ")
    contaPoupanca1.sacar(1.0)
    println("\nTentativa de deposito sendo o usuário: ")
    contaPoupanca2.depositar(1000.0, true)
    println("\nTentativa de saque de 200 reais: ")
    contaPoupanca2.sacar(200.0)

    println("\n==========Conta Corrente=========")
    val contaCorrente1 = ContaCorrente(5000.0)
    val contaCorrente2 = ContaCorrente(1000.0)
    println("Tentativa de deposito maior que 5000 reais: ")
    contaCorrente1.depositar(6000.0)
    println("\nTentativa de saque de 7000 reais: ")
    contaCorrente1.sacar(7000.0)
    println("\nTentativa de deposito menor que 5000 reais: ")
    contaCorrente2.depositar(1000.0)
    println("\nTentativa de saque de 200 reais: ")
    contaCorrente2.sacar(200.0)

}