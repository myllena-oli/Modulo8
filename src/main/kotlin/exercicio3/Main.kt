package exercicio3

fun main() {
    val filme1 = Filme()
    filme1.titulo = "Os Vingadores"
    filme1.duracaoEmMinutos = 142
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme()
    filme2.apply {
        titulo = "Hotel Transilvânia"
        duracaoEmMinutos = 93
    }

    filme2.exibirDuracaoEmHoras()
    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}.\n")

    val filmesDisneyPixar = arrayOf(
        Filme().apply {
            titulo = "Toy Story"
            duracaoEmMinutos = 81
        },
        Filme().apply {
            titulo = "Procurando Nemo"
            duracaoEmMinutos = 100
        },
        Filme().apply {
            titulo = "Os Incríveis"
            duracaoEmMinutos = 115
        },
        Filme().apply {
            titulo = "Zootopia"
            duracaoEmMinutos = 108
        },
        Filme().apply {
            titulo = "Divertida Mente"
            duracaoEmMinutos = 95
        }
    )

    for (filme in filmesDisneyPixar) {
        filme.exibirDuracaoEmHoras()
    }

}