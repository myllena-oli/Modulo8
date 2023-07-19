package exercicio3

class Dicionario {
    private val mapaDePalavras = mutableMapOf<String, String>()

    fun adicionarTermo() {
        var palavra:String
        while(true) {
            println("Digite a palavra: ")
            palavra = readln()
            if (palavra==""){
                continue
            }
            break
        }
        if (mapaDePalavras.containsKey(palavra)) {
            println("Já existe esse termo no dicionário!")
        } else {
            var significado:String
            while (true) {
                println("Escreva o significado:")
                significado = readlnOrNull() ?: ""
                if (significado == "") {
                    continue
                }
                break
            }
            mapaDePalavras[palavra] = significado
        }

    }

    fun procurarTermo() {

        println("Digite a palavra: ")
        val palavra = readln()
        val significado = mapaDePalavras[palavra]
        if (significado==null){
            println("Não há essa palavra no dicionário")
        }else{
            println("Significado: $significado")
        }

    }

    fun listarTermos() {
        if (mapaDePalavras.isEmpty()){
            println("Não há termos no dicionário.")
        }else{
            for (palavra in mapaDePalavras.toSortedMap()){
                println("${palavra.key}: ${palavra.value} ")
            }
        }

    }
}