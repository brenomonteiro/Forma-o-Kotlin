import br.com.alura.algoritimos.teste.buscaCarroMaisBarato
import br.com.alura.bytebank.collections.testeCollection
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaComportamentosConta
import br.com.alura.bytebank.teste.testaFuncoesEscopo
import br.com.alura.bytebank.teste.testeLista
import br.com.alura.bytebank.teste.testeRange
import java.lang.Exception

fun main() {
    testaRun()
    testaFuncoesEscopo()

}


fun testaRun() {
    val taxaAnual = 0.05;
    val taxaMensal = taxaAnual / 12
    val contaPoupanca = ContaPoupanca(Cliente(nome = "breno", cpf = "123", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal

    }.let { rendimentoMensal ->
        println("Rendimento mensal $rendimentoMensal")
    }

    val rendimentoAnual: Double = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("rendimento anual $rendimentoAnual")
}

fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "rua ceará"
        numero = 3587
        bairro = "Custódio Pereira"
        cidade = "São Paulo"
        estado = "SP"
        cep = "38405240"
        complemento = "casa"

        completo()
    }.let(::println)
}













