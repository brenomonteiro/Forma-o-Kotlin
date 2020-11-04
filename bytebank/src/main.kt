import br.com.alura.algoritimos.teste.buscaCarroMaisBarato
import br.com.alura.bytebank.collections.testeCollection
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.Prateleira
import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.teste.testaComportamentosConta
import br.com.alura.bytebank.teste.testeLista
import br.com.alura.bytebank.teste.testeRange
import java.lang.Exception

fun main() {
//teste(1,{})
//    val endereco = Endereco(logradouro = "rua vergueiro",numero = 3287)
//    val enderecoMaiusculo = "${endereco.logradouro},${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)


    run{
        println("Olá teste run sem extensão");
    }



    Endereco(logradouro = "rua vergueiro", numero = 3287)
            .also{ println("Testando o also antes de rodar o RUN")}
            .run{
                "$logradouro,$numero".toUpperCase()
            }.let{
                enderecoMaiusculo: String -> println(enderecoMaiusculo)
            }

    Endereco()
            .apply {
                logradouro = "casa"
                numero = 234

            }.let(::println)

    with(Endereco(logradouro = "rua vergueiro", numero = 3287)){
        val log = logradouro.toUpperCase()
        println(log)
    }




//    listOf(Endereco(
//            logradouro = "rua vergueiro", numero = 3287, complemento = "casa"),
//            Endereco(logradouro = "rua vergueiro", numero = 3287, complemento = "ap"),
//            Endereco()).filter { endereco -> endereco.complemento.isNotEmpty() }.let(::println)
//
//
//    soma(1, 6) {
//        println(it)
//    }
//
//    val autenticavel = object : Autenticavel {
//        val senha = 1234
//        override fun autentica(senha: Int) = this.senha == senha
//
//
//    }
//
//    SistemaInterno().entra(autenticavel,1234, autenticado = {println("realizar pagamento")})

}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit) {

}









