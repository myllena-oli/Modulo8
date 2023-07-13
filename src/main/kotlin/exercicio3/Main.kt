package exercicio3

fun main(){
    val timeFutebol1 = Futebol("Atlético Mineiro", 30, 9)
    val timeFutebol2 = Futebol("Cruzeiro", 36, 7)

    val timeVolei1 = Volei("Praia Clube",15,20)
    val timeVolei2 = Volei("Osasco Voleibol Clube",18,17)

    val timeControle = TimeControle()
    timeControle.adicionar(timeFutebol1)
    timeControle.adicionar(timeFutebol2)
    timeControle.adicionar(timeVolei1)
    timeControle.adicionar(timeVolei2)

    timeControle.exibirLista()
}