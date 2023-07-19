package exercicio3

import java.math.BigDecimal

fun main() {
    while (true) {
        println("Boas vindas ao conversor de moedas")
        println("Qual moeda você deseja converter? \n1 - Dólar americano\n2 - Dólar canadense\n3 - Euro\n4 - Libra Esterlina")
        val tipoMoeda = when (readln()) {
            "1" -> "Dólar americano"

            "2" -> "Dólar canadense"

            "3" -> "Euro"

            "4" -> "Libra Esterlina"

            else -> {
                println("Opção inválida")
                continue
            }
        }
        var moeda = Moedas("", 0.00)
        moeda = moeda.preencherMoeda(tipoMoeda)
        println("ATENÇÃO: Só posso converter $tipoMoeda para real.")
        while (true) {
            try {
                println("Digite o valor a ser convertido:")
                val valorParaConverter = readln().toDouble()
                val valor = BigDecimal(valorParaConverter)
                if (valor <= BigDecimal.ZERO) {
                    println("Valor inválido, por favor, tente novamente")
                    continue
                }
                val valorConvertido = moeda.converterParaReal(valor, moeda)
                println(
                    "A " + moeda.nome + " na cotação de hoje " + moeda.obterDiaAtual() +
                            " está em " + moeda.cotacao + ", o valor que pediu para converter de " +
                            valor + " em reais é R$" + valorConvertido
                )
                break
            } catch (e: NumberFormatException) {
                println("Causa: ${e.cause}")
                println("Mensagem: ${e.message}")
                e.printStackTrace()
                println("Para moeda, o valor monetário deve ser um número decimal")
            } catch (e: IllegalArgumentException) {
                println("Causa: ${e.cause}")
                println("Mensagem: ${e.message}")
                e.printStackTrace()
                println("Tipo de moeda inválido")
            }
        }

        println("Digite N para sair ou outra tecla para continuar:")
        val opcao = readln()
        if (opcao.equals("N", ignoreCase = true)) {
            break
        }
    }
}