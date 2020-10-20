package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjetos() {
    val gerente = Gerente("breno", "11111111111", 2000.0, 23)
    val diretor = Diretor("breno", "11111111111", 2000.0, 23, 34.0)

    val endereco = Endereco(logradouro = "logradouro", numero = 1, bairro = "custodio", cidade = "udia", estado = "mg", cep = "38405-240")
    val cliente = Cliente(nome = "breno", cpf = "1234", senha = 123, endereco = endereco)
    val sistemaInterno = SistemaInterno();
    sistemaInterno.entra(cliente, 123)


    testaContasDiferentes()
    println(Conta.total)
    val palavra: String = "";
    //val palavraJava: java.lang.String = java.lang.String("");
    val palavraJava: java.lang.String = java.lang.String("");

    println(cliente.endereco.bairro)
}
