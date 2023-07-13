package exercicio1

import java.time.LocalDate

class Frutas (nome: String, codigoDeBarras: String, dataDeValidade: LocalDate) : Produto(nome, codigoDeBarras, dataDeValidade)
class Verdura (nome: String, codigoDeBarras: String, dataDeValidade: LocalDate) : Produto(nome, codigoDeBarras, dataDeValidade)
class Legume (nome: String, codigoDeBarras: String, dataDeValidade: LocalDate) : Produto(nome, codigoDeBarras, dataDeValidade)

fun main(){
    val verdura1 = Verdura("Alface","1234567890",LocalDate.of(2023, 8, 1))
    val legume1 = Legume("Feijão","2345678901",LocalDate.of(2023, 9, 2))
    val fruta1 = Frutas("Morango","3456789012",LocalDate.of(2023, 11, 3))
    val produtos = listOf(verdura1,legume1,fruta1)
    for(produto in produtos){
        println("Nome: ${produto.nome}\tNome: ${produto.codigoDeBarras}\tNome: ${produto.dataDeValidade}")
    }
}
