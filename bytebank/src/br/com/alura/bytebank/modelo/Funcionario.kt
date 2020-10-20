package br.com.alura.bytebank.modelo

abstract class Funcionario(
        val nome: String,
        val cpf: String,
        var salario: Double
) {
//    open val bonificacao: Double
//        get() = salario * 0.1

    abstract fun bonificacao(): Double


}