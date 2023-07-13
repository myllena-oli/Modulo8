package exercicio2

fun main(){
    val biblioteca = Biblioteca()

    val ficcao = LivroFiccaoCientifica("Maze Runner - Correr ou Morrer", "James Dashner")
    val suspense = LivroSuspense("Caixa de Pássaros", "Josh Malerman")
    val romance = LivroRomance("Perdão, Leonard Peacock", "Matthew Quick")
    biblioteca.salvarLivro(ficcao)
    biblioteca.salvarLivro(suspense)
    biblioteca.salvarLivro(romance)
    biblioteca.mostrarLista()
}