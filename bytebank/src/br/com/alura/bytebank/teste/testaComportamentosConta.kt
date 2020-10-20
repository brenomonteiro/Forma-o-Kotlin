package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
//    var contaBreno = ContaPoupanca(numero = 999, titular = "Breno");
//    contaBreno.deposita(300.0)

    var clienteBryan = Cliente(nome = "Bryan",cpf = "1111",senha = 123);
    var contaBryan = ContaCorrente(titular = clienteBryan, numero = 1000);
    println("Bem vindo ao banco");


//    println("Depositando na conta do breno");
//    contaBreno.deposita(100.0);
//    println(contaBreno.saldo);

    println("Depositando na conta do bryan");
    contaBryan.deposita(1300.0);

    println(contaBryan.saldo);

    println("saque realizado")
    contaBryan.saca(1300.0);
//    contaBreno.saca(50.0);
    println(contaBryan.saldo);

    println("transferencia");
//    contaBreno.transfere(50.0, contaBryan);
    println(contaBryan.saldo);
//    println(contaBreno.saldo);
}