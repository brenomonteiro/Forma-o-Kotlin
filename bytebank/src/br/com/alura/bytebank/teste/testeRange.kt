package br.com.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testeRange() {
    //iteração
    val base = 1500.0;
    val topo = 4000.0;

    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0);
    var contador1 = 0;
    for (salario in salarios) {
        if (salario in base..topo) {
            contador1++
        }
    }
    println("contador1 = $contador1")

    //simplificando
    val contador2 = salarios.count { it in base..topo }
    println("contador2 = $contador2")

    //funções agregadoras
    val maiorIdade = salarios.max();
    val menorSalario = salarios.min();
    val mediaSalario = salarios.average();

    //para identificar todos ou qualquer um valor que se adeque a determinada condição
    val todosMaiores: Boolean = salarios.all { it >= 18 }
    val existeMenor: Boolean = salarios.any { it < 18 }

    //filtrar valores
    val maiores: List<Double> = salarios.filter { it >= 18 }
    val menores: DoubleArray = salarios.filter { it < 18 }.toDoubleArray();

    //find e contains
    val contemDez: Boolean = salarios.contains(10.0)
    val idade: Double? = salarios.find { it == 10.0 }

    val salarios1 = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    var aumento1 = "1.1".toBigDecimal()
    val salarioBigD = "379.90".toBigDecimal();
    val salariosComAumento: Array<BigDecimal> = salarios
            .map { salario -> calculaAumentoRelativo(salarioBigD, aumento1) }
            .toTypedArray()

    //func Big Decimal

}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

