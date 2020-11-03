package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco

fun testaCondicoesFor() {
    val titular = "Breno";
    val numeroConta = 123458;
    var saldoConta = 0.2;
    saldoConta += 100;
    saldoConta -= 100.3;
    for (i in 5 downTo 1 step 2) {
//        println("Bem vindo ao Bytebank");
//        println("Titular $titular $i");
//        println("Nº da conta é $numeroConta");
//        println("saldo da conta é $saldoConta");
//        println();
    }
    var x = 0;
    while (x < 5) {
        println("Bem vindo ao Bytebank");
        println("Titular $titular $x+1");
        println("Nº da conta é $numeroConta");
        println("saldo da conta é $saldoConta");
        println();
        x++;
    }
}

fun testaEndereco() {
    println("bem vindo")

//
//    var endereco = Endereco();
//    var endereco2 = Endereco();
//    println(endereco.toString())
//    println(endereco)
//    println(endereco.hashCode())
//    println(endereco.equals(endereco))

    //funcao1()

//    testaComportamentosConta()
//    println("fim função main")

    var enderecoNulo: Endereco? = Endereco(logradouro = "rua ceará", complemento = "23")
    println(enderecoNulo?.logradouro)
    enderecoNulo?.let {
        println(it.logradouro)
        var tamanhoComplemento: Int = it.complemento?.length ?: 0
        println(tamanhoComplemento)
    }
}

fun testeCast(valor: Any) {
    var numero: Int? = valor as? Int
    println(numero)
}

fun funcao1() {
    println("inicio função1");
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace();
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim função1")
}

fun funcao2() {
    println("inicio função2");
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim função2")
}
