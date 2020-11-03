package br.com.alura.algoritimos.teste

import br.com.alura.algoritimos.modelo.Carro

fun buscaCarroMaisBarato() {
    val listaCarros = mutableListOf(
            Carro("fusca", 10000.00),
            Carro("caminhonete", 3000.00),
            null
    )

    val listaSemNull = listaCarros.filterNotNull()
    var carroMenorValor = listaSemNull[0]

    for (carro in listaSemNull) {
        if (carro.valor < carroMenorValor.valor) {
            carroMenorValor = carro
        }


    }


    val ordenadoPovalor = listaSemNull.sortedBy { it.valor }
    println(ordenadoPovalor[0].marca)
    println("O carro mais barato é: ${carroMenorValor?.marca} no valor de ${carroMenorValor?.valor}")
}