package exercicio4

import java.lang.NumberFormatException

class ImpostoSobreRenda {

    private val dadosPessoas = mutableMapOf<MutableList<String>, MutableList<Double>>()

    fun recebeDados() {
        val listaSalario: MutableList<Double>
        val listaNomeProfissao = mutableListOf<String>()
        var nome :String
        var profissao :String

        while (true) {

            println("Digite seu nome: ")
            nome = readln()
            println("Digite sua profissão: ")
            profissao = readln()
            if (nome == "" || profissao == "") {
                println("Dados inválidos")
                continue
            }
            break
        }

        if (dadosPessoas.containsKey(listOf(nome, profissao))) {
            println("Pessoa já cadastrada!")
            return
        } else {
            listaNomeProfissao.addAll(listOf(nome, profissao))
            listaSalario = recebeSalarios()
        }

        dadosPessoas[listaNomeProfissao] = listaSalario

    }

    private fun recebeSalarios(): MutableList<Double> {
        val listaSalario = mutableListOf<Double>()
        var salario: Double
        for (i in 1..12) {
            while (true) {
                try {
                    println("Digite o salário do mês $i:")
                    salario = readln().toDouble()
                    if (salario<0){
                        println("Valor inválido!")
                        continue
                    }
                } catch (excecao: NumberFormatException) {
                    continue
                }
                listaSalario.add(salario)
                break
            }
        }
        return listaSalario
    }

    fun mostrarSalarios() {
        var chave = mutableListOf<String>()
        if (dadosPessoas.isEmpty()) {
            println("Não há pessoas cadastradas.")
            return
        } else {
            var i = 0
            var j = 0
            var k = 0
            println("Selecione a pessoa:")
            for (dados in dadosPessoas) {
                i++
                println("$i - Nome: ${dados.key[0]} \tProfissão: ${dados.key[1]}")
            }
            val opcao = readln().toIntOrNull() ?: 0
            if (opcao < 1 || opcao > dadosPessoas.size) {
                println("Dados não existentes para essa pessoa!")
                return
            }
            for (dados in dadosPessoas) {
                j++
                if (j == opcao) {
                    chave = dados.key
                    for (salario in dados.value) {
                        k++
                        println("Mês: $k\tSalário: R$%.2f".format(salario))
                    }
                }
            }
        }
        while (true) {
            println("\nDeseja:\n1 - Calcular Imposto\n2 - Voltar ao menu anterior")
            when (readln().toIntOrNull()) {
                1 -> calcularImposto(chave)
                2 -> return
                else -> println("Opção inválida!")
            }
        }
    }

    private fun calcularImposto(chave: MutableList<String>) {
        val listaSelecionada = dadosPessoas[chave]
        var taxa : Double
        var i=0
        if (listaSelecionada != null) {
            for (item in listaSelecionada) {
                taxa = when {
                    item > 0.00 && item <= 2000.00 -> 0.00
                    item > 2001.00 && item <= 3000.00 -> 0.08
                    item > 3001.00 && item <= 4500.00 -> 0.18
                    item > 4500.00 -> 0.28
                    else -> 0.00
                }
                i++
                println("Mês: $i\tSalário: R$%.2f\tImposto: R$%.2f".format(item, item*taxa))
            }
        }
    }
}


