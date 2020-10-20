package br.com.alura.bytebank.teste

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