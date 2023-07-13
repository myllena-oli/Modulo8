package exercicio2

class Biblioteca {
    private val livros : MutableList<Livro> = mutableListOf()
    fun salvarLivro(livro: Livro) {
        livros.add(livro)
    }
    fun mostrarLista(){
        for (livro in livros){
            livro.mostrar()
        }
    }

}