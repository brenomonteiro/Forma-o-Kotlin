package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*


fun testaFuncionario() {
    var breno = Gerente(nome = "breno", salario = 2000.00, cpf = "01650447647", senha = 89765);
    var bruna = Gerente("bruna", "11111111111", 2000.00, 2000);
    var bruno = Diretor("bruna", "11111111111", 2000.00, 2000, 45.8);
    var brenda = Analista("brenda", "11111111111", 2000.00);

    println("breno ${breno.bonificacao()}");
    println("bruna ${bruna.bonificacao()}");
    println("bruno ${bruno.bonificacao()}");
    var calculadora = CalculadoraBonificacao();
    calculadora.registra(breno)
    calculadora.registra(bruna)
    calculadora.registra(bruno)
    calculadora.registra(brenda)
    println("calculadora ${calculadora.total}");
}