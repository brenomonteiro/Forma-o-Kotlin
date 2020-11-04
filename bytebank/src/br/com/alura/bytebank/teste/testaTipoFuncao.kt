package br.com.alura.bytebank.teste

fun testaTipoFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int,Int) -> Int = fun(a:Int,b:Int):Int {
        return a+b
    }
    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima(10,10))
    val calculaBonificacaoAnonima:(salario:Double) ->Double = fun(salario):Double{
        if(salario>1000){
            return salario+50
        }
        return salario+100
    }

}

fun testaTipoFuncaoLambda() {
    val minhaFuncaoLambda: (Int,Int) -> Int = {
        a,b -> a+b
    }
    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda(5,5))

    val calculaBonificacao:(salario:Double)->Double=lambda@{salario ->
        if(salario>1000){
            return@lambda salario+50
        }
        salario+100
    }


    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoClasse() {
    var minhaFuncaoClasse: (Int,Int) -> Int = Soma();
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse(3,9))
}

fun testaTipoFuncaoReferencia() {
    var minhaFuncao: (Int,Int) -> Int = ::soma;
    println(minhaFuncao)
    println(minhaFuncao(4,2))
}

fun teste() {
    println("ola")
}

fun soma(a:Int,b:Int):Int{
    return a+b;
}
class Soma : (Int,Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a+b;

}

