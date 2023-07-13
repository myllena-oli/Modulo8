package exercicio4

class RecursosHumanos {
    private val funcionarios: MutableList<Funcionario> = mutableListOf()

    fun adicionar(funcionario: Funcionario) {
        funcionarios.add(funcionario)
    }

    fun exibir() {
        for (funcionario in funcionarios) {
            funcionario.mostrar()
            println()
        }
    }
}