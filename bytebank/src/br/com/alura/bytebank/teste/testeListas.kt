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