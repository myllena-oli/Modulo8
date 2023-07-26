package exercicio1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProdutoMaisBaratoTest{
    @Test
    fun deveRetornarVerdadeiroParaOProduto(){
        val produto = ProdutoMaisBarato()
        val resultado1 = produto.encontrarProdutoMaisBarato(10.0, 15.0, 12.0)
        val resultado2 = produto.encontrarProdutoMaisBarato(5.0, 2.0, 7.0)
        val resultado3 = produto.encontrarProdutoMaisBarato(3.0, 3.0, 1.0)

        assertEquals(1, resultado1)
        assertEquals(2, resultado2)
        assertEquals(3, resultado3)
    }
}