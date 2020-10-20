package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    var clienteBryan = Cliente(nome = "Bryan",cpf = "1111",senha = 123);
    val contaPoupanca = ContaPoupanca(clienteBryan, 1)
    val contaCorrente = ContaCorrente(clienteBryan, 2)
    val contaCorrente1 = ContaCorrente(clienteBryan, 2)
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("valor deposita poupança ${contaPoupanca.titular.cpf}")
    println("valor deposita corrente ${contaCorrente.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("valor após saque poupança ${contaPoupanca.saldo}")
    println("valor após saque corrente ${contaCorrente.saldo}")
}