package exercicio1
 fun main(){
     val novoFuncionario = Funcionario()
     novoFuncionario.nome = "Luis"
     novoFuncionario.sobrenome = "Silva"
     novoFuncionario.horasTrabalhadas = 10
     novoFuncionario.valorPorHora = 25.50
     novoFuncionario.nomeCompleto()
     novoFuncionario.calcularSalario()
     novoFuncionario.incrementarHoras(8)
     novoFuncionario.calcularSalario()

     val funcionarios = ArrayList<Funcionario>()

     val funcionario1 = Funcionario()
     funcionario1.nome = "Tony"
     funcionario1.sobrenome = "Stark"
     funcionario1.horasTrabalhadas = 40
     funcionario1.valorPorHora = 30.0
     funcionarios.add(funcionario1)

     val funcionario2 = Funcionario()
     funcionario2.nome = "Steve"
     funcionario2.sobrenome = "Rogers"
     funcionario2.horasTrabalhadas = 35
     funcionario2.valorPorHora = 28.5
     funcionarios.add(funcionario2)

     val funcionario3 = Funcionario()
     funcionario3.nome = "Natasha"
     funcionario3.sobrenome = "Romanoff"
     funcionario3.horasTrabalhadas = 42
     funcionario3.valorPorHora = 32.0
     funcionarios.add(funcionario3)

     val funcionario4 = Funcionario()
     funcionario4.nome = "Bruce"
     funcionario4.sobrenome = "Banner"
     funcionario4.horasTrabalhadas = 38
     funcionario4.valorPorHora = 27.0
     funcionarios.add(funcionario4)

     val funcionario5 = Funcionario()
     funcionario5.nome = "Thor"
     funcionario5.sobrenome = "Odinson"
     funcionario5.horasTrabalhadas = 40
     funcionario5.valorPorHora = 30.5
     funcionarios.add(funcionario5)

     val funcionario6 = Funcionario()
     funcionario6.nome = "Peter"
     funcionario6.sobrenome = "Parker"
     funcionario6.horasTrabalhadas = 37
     funcionario6.valorPorHora = 29.0
     funcionarios.add(funcionario6)

     val funcionario7 = Funcionario()
     funcionario7.nome = "Stephen"
     funcionario7.sobrenome = "Strange"
     funcionario7.horasTrabalhadas = 39
     funcionario7.valorPorHora = 26.5
     funcionarios.add(funcionario7)

     val funcionario8 = Funcionario()
     funcionario8.nome = "Wanda"
     funcionario8.sobrenome = "Maximoff"
     funcionario8.horasTrabalhadas = 36
     funcionario8.valorPorHora = 31.0
     funcionarios.add(funcionario8)

     val funcionario9 = Funcionario()
     funcionario9.nome = "Peter"
     funcionario9.sobrenome = "Quill"
     funcionario9.horasTrabalhadas = 40
     funcionario9.valorPorHora = 33.0
     funcionarios.add(funcionario9)

     for (funcionario in funcionarios) {
         println()
         funcionario.nomeCompleto()
         funcionario.calcularSalario()
     }
 }


