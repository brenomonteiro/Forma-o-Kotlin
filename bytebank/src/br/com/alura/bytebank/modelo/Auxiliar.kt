package br.com.alura.bytebank.modelo

class Auxiliar(nome: String,
               cpf: String,
               salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun bonificacao(): Double {
        TODO("Not yet implemented")
    }


}