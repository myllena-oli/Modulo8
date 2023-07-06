package exercicio3

class Filme {
    var titulo: String = ""
    var duracaoEmMinutos: Int = 0

    fun exibirDuracaoEmHoras(){
        val horas = duracaoEmMinutos/60
        val minutos = duracaoEmMinutos%60
        println("O filme $titulo possui $horas e $minutos minutos de duração.")
    }
}