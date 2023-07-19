package exercicio6

class GuardaVolumes {
    private val pecasMap = mutableMapOf<Int, ArrayList<Roupas>>()
    private var contador = 0

    fun guardarPecas(listaDePeca: ArrayList<Roupas>): Int {
        pecasMap[++contador] = listaDePeca
        return contador
    }
    fun mostrarPecas() {
        println("====== Guarda-Volumes ======")
        for ((numero, pecas) in pecasMap) {
            println("Identificação: $numero")
            for ((index, peca) in pecas.withIndex()) {
                println("Peça ${index + 1}: Marca: ${peca.marca}, Modelo: ${peca.modelo}")
            }
            println()
        }
    }
    fun mostrarPecas(numero: Int) {
        val pecas = pecasMap[numero]
        if (pecas != null) {
            println("==== Peças associadas ao id $numero ====")
            for ((index, peca) in pecas.withIndex()) {
                println("Peça ${index + 1}: Marca: ${peca.marca}, Modelo: ${peca.modelo}\n")
            }
        } else {
            println("Número de identificação não encontrado.\n")
        }
    }
    fun devolverPecas(numero: Int) {
        pecasMap.remove(numero)
    }

}