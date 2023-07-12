package exercicio3


class NotasEscola {
    data class Aluno(val nota1: Double, val nota2: Double, val nota3: Double, val nota4: Double)
    private fun receberNotas(): Aluno {
        println("Digite as notas da primeira, segunda, terceira e quarta avaliação:")
        val nota1 = lerNotasDoUsuario("\nPrimeira avaliação:")
        val nota2 = lerNotasDoUsuario("\nSegunda avaliação:")
        val nota3 = lerNotasDoUsuario("\nTerceira avaliação:")
        val nota4 = lerNotasDoUsuario("\nQuarta avaliação:")

        return Aluno(nota1, nota2, nota3, nota4)
    }

    private fun lerNotasDoUsuario(avaliacao: String): Double {
        while(true) {
            println(avaliacao)
            val nota = readln().toDoubleOrNull()
            if (nota!! in 0.0..10.0) {
                return nota
            } else {
                println("Nota inválida. Digite novamente!\n")
            }
        }
    }
    private fun media(aluno:Aluno){
        val media = (aluno.nota1 + aluno.nota2 + aluno.nota3 + aluno.nota4) / 4
        println("Média: $media")
    }
    private fun calcularMedia(){
        val aluno = receberNotas()
        media(aluno)
    }

    fun menu(){
        println("\nBem Vindo, professores do SimCity! Vamos começar...")
        calcularMedia()
        while (true) {
            println("Novo cálculo (1-sim 2-nao)")
            when (readln().toIntOrNull()) {
                1 -> calcularMedia()
                2 -> break
                else -> println("Digite uma opção válida!\n")
            }
        }
    }
}