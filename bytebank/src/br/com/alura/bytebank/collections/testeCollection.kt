package br.com.alura.bytebank.collections

fun testeCollection() {


//    val banco = BancoDeNomes();
//    banco.salva("Alex");
//    println(banco.nomes)
//
//    println(BancoDeNomes().nomes)


    testeAssociacao()


}

private fun testeAssociacao() {
    val pedidos = listOf(
            Pedido(1, 1.0),
            Pedido(2, 62.0),
            Pedido(3, 4.0),
            Pedido(4, 57.0)
    )
    println(pedidos)
    // val associate:Map<Int,Pedido> = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }
    val associate: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(associate)
    println(associate[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido->pedido.valor>50 }
    println(pedidosFreteGratis)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido -> pedido.valor>50.0 }

    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("breno","bryan","bruno","maria");
    val groupBy: Map<Char,List<String>> = nomes.groupBy { nome -> nome.first() }
    println(groupBy['b'])
}

data class Pedido(val numero: Int,val valor: Double)

private fun testaMap() {
    val pedidos = mutableMapOf(Pair(1, 30.0), 3 to 40.0)
    println("Pedidos $pedidos")

    val pedido = pedidos[3];
    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[2] = 145.0;
    pedidos.put(6,24.0)
    pedidos.putIfAbsent(7,23.0)
    pedidos.remove(3)
    pedidos.remove(2,145.0)
    println("Pedidos $pedidos")

    val mensagem = pedidos.getOrElse(1,{
        "Não existe"
    })

    val mensagem1 = pedidos.getOrDefault(0,-1
    )
    println(mensagem)
    println(mensagem1)


    for(numero in pedidos.keys){
        println("chaves:$numero")
    }

    for(valores in pedidos.values){
        println("valores: $valores")
    }

    val pedidosFiltrados = pedidos.filter{(numero,valor)-> numero % 2 == 0 && valor > 20.0}

    println("pedidos filtrados : $pedidosFiltrados")

    val pedidosAcima = pedidos.filterValues { valor -> valor>23 }
    println("pedidos acima:$pedidosAcima")

    val pedidosPares = pedidos.filterKeys { numero -> numero%2 == 0 }
    println("pedidos pares:$pedidosPares")

    println(pedidos.minus(1))
    println(pedidos - listOf(6,7))
    pedidos.putAll(listOf(9 to 2.2))
    pedidos+=(listOf(10 to 2.2))

    //pedidos.keys.remove(1)
    println(pedidos)
}

private fun testaSet() {
    //    val assistiramCursoAndroid = listOf("breno","bryan")
//    val assistiramCursoKotlin = listOf("breno","josé")
//    val assistiramAmbos = assistiramCursoAndroid+assistiramCursoKotlin;
//  println("lista com distinct ${assistiramAmbos.distinct()}")
    val assistiramCursoAndroid = mutableSetOf("breno", "bryan")
    val assistiramCursoKotlin = mutableSetOf("breno", "josé", "bryan")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin;

    println("lista com distinct ${assistiramAmbos}")
    println("lista com intersect ${assistiramCursoAndroid intersect assistiramCursoKotlin}")
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList();

    fun salva(nome: String) {
        dados.add(nome);
    }

    companion object {
        private val dados = mutableListOf<String>();
    }
}
