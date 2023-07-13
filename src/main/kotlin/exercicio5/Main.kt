package exercicio5

fun main(){
    val cachorro1 = Cachorro("Danny", "Golden Retriever", "Liam Payne")
    val cachorro2 = Cachorro("Harry", "Labrador Retriever", "Tom Fletcher")
    val gato1 = Gato("Tom", "Siamês", "Harry Styles")
    val gato2 = Gato("Zayn", "Persa", "Louis Tomlinson")
    val peixe1 = Peixe("Nemo", "Palhaço", "Niall Horan")
    val peixe2 = Peixe("Dory", "Tang Azul", "Dougie Poynter")

    cachorro1.acoes()
    cachorro2.acoes()
    gato1.acoes()
    gato2.acoes()
    peixe1.acoes()
    peixe2.acoes()
}