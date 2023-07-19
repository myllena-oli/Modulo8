package exercicio2

import java.util.*

fun main() {
    val compras: MutableList<Alimento> = ArrayList()
    while (true) {
        try {
            println("\n--- MENU ---")
            println("\nQual tipo de alimento quer adicionar")
            println("1. Adicionar VERDURA")
            println("2. Adicionar LEGUME")
            println("3. Adicionar GRÃOS")
            println("4. Adicionar OUTROS")
            println("5. Sair do menu")
            println("Escolha uma opção: ")
            val opcao = readln()
            if (opcao == "5") {
                break
            }
            while (true) {
                if (opcao.equals("VERDURA", ignoreCase = true) || opcao == "1") {
                    var verdura = Verdura("", 0.0)
                    verdura = try {
                        verdura.adicionarVerdura()
                    } catch (e: NumberFormatException) {
                        println("Erro NumberFormatException: " + e.message)
                        continue
                    }
                    compras.add(verdura)
                    break
                } else if (opcao.equals("LEGUME", ignoreCase = true) || opcao == "2") {
                    var legume = Legume("", 0.0)
                    legume = try {
                        legume.adicionarLegume()
                    } catch (e: NumberFormatException) {
                        println("Erro NumberFormatException: " + e.message)
                        continue
                    }
                    compras.add(legume)
                    break
                } else if (opcao.equals("GRÃOS", ignoreCase = true) || opcao == "3") {
                    var grao = Grao("", 0.0)
                    grao = try {
                        grao.adicionarGrao()
                    } catch (e: NumberFormatException) {
                        println("Erro NumberFormatException: " + e.message)
                        continue
                    }
                    compras.add(grao)
                    break
                } else if (opcao.equals("OUTROS", ignoreCase = true) || opcao == "4") {
                    var outro = Outro("", 0.0)
                    outro = try {
                        outro.adicionarOutros()
                    } catch (e: NumberFormatException) {
                        println("Erro NumberFormatException: " + e.message)
                        continue
                    }
                    compras.add(outro)
                    break
                } else {
                    throw IllegalArgumentException("Tipo de alimento inválido")
                }
            }
        } catch (e: IllegalArgumentException) {
            println("Erro IllegalArgumentException: " + e.message)
        }
    }
    println("\n--- LISTA DE COMPRAS ---")
    var numeroVerdura = 0
    var numeroLegumes = 0
    var numeroGrao = 0
    var numeroOutro = 0
    for (alimento in compras) {
        when (alimento) {
            is Verdura -> {
                println("${alimento.tipo} - ${alimento.nome} - ${alimento.quantidade} kg.")
                numeroVerdura++
            }

            is Legume -> {
                println("${alimento.tipo} - ${alimento.nome} - %.0f un.".format(alimento.quantidade))
                numeroLegumes++
            }

            is Grao -> {
                println("${alimento.tipo} - ${alimento.nome} - ${alimento.quantidade} kg.")
                numeroGrao++
            }

            else -> {
                println("${alimento.tipo} - ${alimento.nome} - %.0f un.".format(alimento.quantidade))
                numeroOutro++
            }
        }
    }
    println("\n--- QUANTIDADE DE ALIMENTOS ---")
    println("Verduras: $numeroVerdura")
    println("Legumes: $numeroLegumes")
    println("Grãos: $numeroGrao")
    println("Outros: $numeroOutro")
}