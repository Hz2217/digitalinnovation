package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val felipe = Analista("Felipe", "111.111.111-11", 2000.0)
    ImprimeRelatorioFuncionario.imprime(felipe)
}

