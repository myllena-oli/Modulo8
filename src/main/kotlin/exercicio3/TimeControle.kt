package exercicio3

class TimeControle {
    private val times: MutableList<TimeModelo> = mutableListOf()
    fun adicionar(time: TimeModelo){
        times.add(time)
    }
    fun exibirLista(){
        for(time in times){
            time.mostrar()
        }
    }
}