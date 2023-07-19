package exercicio1

class CalculoMatematico {
    fun divisao(dividendo: Int, divisor: Int): Int{
        return try{
            dividendo/divisor
        }catch (excecao: ArithmeticException){
            println("Causa: ${excecao.cause}")
            println("Mensagem: ${excecao.message}")
            excecao.printStackTrace()
            0
        }

    }
}