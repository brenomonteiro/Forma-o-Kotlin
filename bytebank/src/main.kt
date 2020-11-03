import br.com.alura.algoritimos.teste.buscaCarroMaisBarato
import br.com.alura.bytebank.collections.testeCollection
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.Prateleira
import br.com.alura.bytebank.teste.testaComportamentosConta
import br.com.alura.bytebank.teste.testeLista
import br.com.alura.bytebank.teste.testeRange
import java.lang.Exception

fun main() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    testaTipoFuncaoLambda()
    testaTipoFuncaoAnonima()

}

fun testaTipoFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa anonimo")
    }
    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoLambda() {
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa lambda")
    }
    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda())
}

fun testaTipoFuncaoClasse() {
    var minhaFuncaoClasse: () -> Unit = Teste();
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    var minhaFuncao: () -> Unit = ::teste;
    println(minhaFuncao)
    println(minhaFuncao())
}

fun teste() {
    println("ola")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("invoke class")
    }
}









