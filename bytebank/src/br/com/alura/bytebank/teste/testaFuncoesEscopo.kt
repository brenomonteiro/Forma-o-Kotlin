package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaFuncoesEscopo() {
//    run {
//        println("Olá teste run sem extensão");
//    }
//
//
//
//    Endereco(logradouro = "rua vergueiro", numero = 3287)
//            .also { println("Testando o also antes de rodar o RUN") }
//            .run {
//                "$logradouro,$numero".toUpperCase()
//            }.let { enderecoMaiusculo: String ->
//                println(enderecoMaiusculo)
//            }
//
//    Endereco()
//            .apply {
//                logradouro = "casa"
//                numero = 234
//
//            }.let(::println)
//
//    with(Endereco(logradouro = "rua vergueiro", numero = 3287)) {
//        val log = logradouro.toUpperCase()
//        println(log)
//    }
//
//
//    listOf(Endereco(
//            logradouro = "rua vergueiro", numero = 3287, complemento = "casa"),
//            Endereco(logradouro = "rua vergueiro", numero = 3287, complemento = "ap"),
//            Endereco()).filter { endereco -> endereco.complemento.isNotEmpty() }.let(::println)


    soma(1, 6) {
        println(it)
    }
    somaReciever(1,5,resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha


    }

    SistemaInterno().entra(autenticavel,1234, autenticado = {println("realizar pagamento")})
    val siatema = SistemaInterno()
    siatema.entraReciever(autenticavel,1234, autenticado = {pagamento()})
}



fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

//higher order function
fun teste1(teste: Int, bloco: () -> Unit) {

}

fun somaReciever(a:Int, b:Int, resultado: Int.() -> Unit){
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}