import br.com.alura.bytebank.collections.testeCollection
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.Prateleira
import br.com.alura.bytebank.teste.testaComportamentosConta
import br.com.alura.bytebank.teste.testeLista
import br.com.alura.bytebank.teste.testeRange
import java.lang.Exception

fun main() {




    testeCollection()

}

private fun salariosComAumento() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0);
    val aumento = 1.1;
    for (indice in salarios.indices) {
        salarios[indice] *=  aumento;

    }

    //com foreach

    salarios.forEachIndexed{i,salario -> salarios[i] *= aumento}

    println("salários com aumento ${salarios.contentToString()}")
}

private fun comparacaoIdadesArraySimples() {
    val idades = IntArray(3);
    //forma mais enxuta
    //val idades: IntArray = intArrayOf(4,6,2)
    idades[0] = 4;
    idades[1] = 6;
    idades[2] = 2;

    //com if
//    val maiorIdade = if (idades[0] > idades[1] && idades[0] > idades[2]) {
//        idades[0]
//    } else if (idades[1] > idades[0] && idades[1] > idades[2]) {
//        idades[1]
//    } else {
//        idades[2]
//    }

    //com for
    var maiorIdade = Int.MIN_VALUE;
    for(idade in idades){
        if (maiorIdade<idade){
            maiorIdade = idade
        }
    }

    var menorIdade = Int.MAX_VALUE;
    for(idade in idades){
        if (menorIdade>idade){
            menorIdade = idade
        }
    }


    println("maior idade é $maiorIdade")
    println("menor idade é $menorIdade")
}

private fun comparacaoIdadesSemArray() {
    val idades = 25;
    val idades2 = 24;
    val idades3 = 67;

    val maiorIdade = if (idades > idades2 && idades > idades3) {
        idades
    } else if (idades2 > idades && idades2 > idades3) {
        idades2
    } else {
        idades3
    }

    println("maior idade é $maiorIdade")
}

private fun testaEndereco() {
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









