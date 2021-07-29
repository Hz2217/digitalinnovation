package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente


fun main() {
    val cintia = Gerente("Cintia", "123.123.123-12", 5000.0, "senha1234")
    ImprimeRelatorioFuncionario.imprime(cintia)

    TesteAutenticacao().autentica(cintia)
}

