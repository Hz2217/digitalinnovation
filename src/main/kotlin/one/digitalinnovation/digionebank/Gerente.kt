package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Logavel as Logavel1

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
) : Funcionario(nome, cpf, salario), Logavel1 {
    override fun calculoAuxilio(): Double = salario*0.4

    override fun login():  Boolean = "senha123" == senha
}