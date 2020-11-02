package br.com.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testeOperacoesCompostas() {
    val salarios1 = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    var aumento1 = "1.1".toBigDecimal()
    val gastoInicial = salarios1.somatoria()
    val meses = 6.toBigDecimal()
    val gastoTotal = salarios1.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }


    val media = salarios1
            .sorted()
            .takeLast(3)
            .toTypedArray()
            .media()

    val mediaMenoresSalarios = salarios1
            .sorted()
            .take(3)
            .toTypedArray()
            .media()
}
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}