package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Livro
import br.com.alura.bytebank.modelo.Prateleira

fun testeLista() {
    val livro1 = Livro(titulo = "peter pan",autor = "a", anoPublicacao = 1990,editora = "som livre")
    val livro2 = Livro(titulo = "senhor dos aneis",autor = "c", anoPublicacao = 1890,editora = "som livre")
    val livro3 = Livro(titulo = "rei do gado" ,autor = "b", anoPublicacao = 1690,editora = "som livre")
    val livro4 = Livro(titulo = "ratatuile" ,autor = "d", anoPublicacao = 1670,editora = "som livre")

    val livros: MutableList<Livro> = mutableListOf(livro1,livro2)
    livros.remove(livro1)
    livros.add(livro1)
    livros.add(livro3)
    livros.add(livro4)
    livros.sorted()
    livros.imprimeComMarcadores()


    val ordenadoAnoPublicacao: List<Livro> = livros.sorted();
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPoTitulo = livros.sortedBy { it.titulo }
    ordenadoPoTitulo.imprimeComMarcadores()

    val titulos: List<String> = livros.filter { it.titulo.startsWith("r") }.sortedBy { it.anoPublicacao }.map { it.titulo }

    println(titulos)

    livros
            .groupBy { it.editora ?: "Editora desconhecida" }
            .forEach { (editora: String, livros: List<Livro>) ->
                println("$editora: ${livros.joinToString { it.titulo }}")
            }


    val prateleira = Prateleira(genero = "Literatura", livros = livros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}


fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
            .filterNotNull()
            .joinToString(separator = "\n") {
                " - ${it.titulo} de ${it.autor}"
            }
    println(" #### Lista de Livros #### \n$textoFormatado")
}

fun salariosComAumento() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0);
    val aumento = 1.1;
    for (indice in salarios.indices) {
        salarios[indice] *=  aumento;

    }

    //com foreach

    salarios.forEachIndexed{i,salario -> salarios[i] *= aumento}

    println("salários com aumento ${salarios.contentToString()}")
}

fun comparacaoIdadesArraySimples() {
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

fun comparacaoIdadesSemArray() {
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