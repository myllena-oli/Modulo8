package exercicio2

fun main(){
    val livroFavorito = Livros()
    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98

    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")

    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    val livros = ArrayList<Livros>()

    val livro1 = Livros()
    livro1.titulo = "Harry Potter e a Pedra Filosofal"
    livro1.qtdPaginas = 223
    livro1.paginasLidas = 223
    livros.add(livro1)

    val livro2 = Livros()
    livro2.titulo = "Harry Potter e a Câmara Secreta"
    livro2.qtdPaginas = 251
    livro2.paginasLidas = 251
    livros.add(livro2)

    val livro3 = Livros()
    livro3.titulo = "Harry Potter e o Prisioneiro de Azkaban"
    livro3.qtdPaginas = 317
    livro3.paginasLidas = 317
    livros.add(livro3)

    val livro4 = Livros()
    livro4.titulo = "Harry Potter e o Cálice de Fogo"
    livro4.qtdPaginas = 636
    livro4.paginasLidas = 636
    livros.add(livro4)

    val livro5 = Livros()
    livro5.titulo = "Harry Potter e a Ordem da Fênix"
    livro5.qtdPaginas = 766
    livro5.paginasLidas = 500
    livros.add(livro5)

    val livro6 = Livros()
    livro6.titulo = "As Provações de Apolo: O Oráculo Oculto"
    livro6.qtdPaginas = 320
    livro6.paginasLidas = 250
    livros.add(livro6)

    val livro7 = Livros()
    livro7.titulo = "As Provações de Apolo: A Profecia das Sombras"
    livro7.qtdPaginas = 368
    livro7.paginasLidas = 280
    livros.add(livro7)

    val livro8 = Livros()
    livro8.titulo = "Percy Jackson e o Ladrão de Raios"
    livro8.qtdPaginas = 400
    livro8.paginasLidas = 300
    livros.add(livro8)

    val livro9 = Livros()
    livro9.titulo = "Percy Jackson e o Mar de Monstros"
    livro9.qtdPaginas = 288
    livro9.paginasLidas = 200
    livros.add(livro9)

    val livro10 = Livros()
    livro10.titulo = "As Crônicas dos Kane: A Pirâmide Vermelha"
    livro10.qtdPaginas = 447
    livro10.paginasLidas = 300
    livros.add(livro10)

    for(livro in livros){
        println()
        println("O livro ${livro.titulo} possui ${livro.qtdPaginas} páginas")
        livro.verificarProgresso()
    }

}