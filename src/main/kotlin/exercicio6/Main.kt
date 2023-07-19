package exercicio6

import kotlin.system.exitProcess

fun main() {
    val guardaVolumes = GuardaVolumes()

    while (true) {
        println("-------------------- Menu --------------------")
        println("1. Guardar peças")
        println("2. Mostrar todas as peças no guarda-volumes")
        println("3. Mostrar peças por número de identificação")
        println("4. Devolver peças por número de identificação")
        println("5. Sair")
        println("---------------------------------------------")
        print("Escolha uma opção: ")

        val opcao = readln().toInt()

        when (opcao) {
            1 -> {
                var marca:String
                var modelo:String
                while(true) {
                    print("Digite a marca da peça: ")
                    marca = readln()
                    print("Digite o modelo da peça: ")
                    modelo = readln()
                    if(marca==""||modelo==""){
                        println("Dados inválidos! Vamos começar de novo...")
                        continue
                    }
                    break
                }

                val peca = Roupas(marca, modelo)

                val listaDePecas = arrayListOf(peca)
                val id = guardaVolumes.guardarPecas(listaDePecas)
                println("Peças guardadas com o identificador: $id\n")
            }
            2 -> guardaVolumes.mostrarPecas()

            3 -> {
                print("Digite o número de identificação: ")
                val numero = readln().toIntOrNull()

                if (numero != null) {
                    guardaVolumes.mostrarPecas(numero)
                } else {
                    println("Número de identificação inexistente.\n")
                }
            }
            4 -> {
                print("Digite o número de identificação: ")
                val numero = readln().toIntOrNull()

                if (numero != null) {
                    guardaVolumes.devolverPecas(numero)
                    println("Peças devolvidas!")
                } else {
                    println("Número de identificação inexistente.\n")
                }
            }
            5 -> exitProcess(0)
            else -> println("Opção inválida. Tente novamente.\n")
        }
    }
}