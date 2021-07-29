package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val paulo = Cliente(
        nome = "Paulo Oliveira",
        cpf = "123.456.789.10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(paulo)

    TesteAutenticacao().autentica(paulo)
}
