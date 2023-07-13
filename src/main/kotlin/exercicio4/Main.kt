package exercicio4

import java.time.LocalDate


fun main() {
    val funcionario1 = Funcionario("Phineas", "Engenharia", 6815.10, LocalDate.of(2023, 1, 1))
    val funcionario2 = Funcionario("Ferb", "Arquiteto", 6270.0, LocalDate.of(2023, 2, 2))
    val estagiario1 = Estagiario("Candace", "Marketing", 1200.0, LocalDate.of(2023, 3, 3))
    val estagiario2 = Estagiario("Perry", "Agente Secreto", 1500.0, LocalDate.of(2023, 4, 4))
    val recursosHumanos = RecursosHumanos()
    recursosHumanos.adicionar(funcionario1)
    recursosHumanos.adicionar(funcionario2)
    recursosHumanos.adicionar(estagiario1)
    recursosHumanos.adicionar(estagiario2)

    recursosHumanos.exibir()
}
