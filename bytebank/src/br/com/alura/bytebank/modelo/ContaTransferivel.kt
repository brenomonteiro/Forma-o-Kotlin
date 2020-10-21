package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(titular: Cliente,
                                 numero: Int) : Conta(titular = titular, numero = numero) {


    fun transfere(valor: Double, destino: Conta,senha: Int) {
        if (this.saldo < valor) {
            throw SaldoInsuficienteException("saldo insuficiente ${saldo}");

        }
        if(!autentica(senha)){
            throw  FalhaAutenticacaoException();
        }
        this.saldo -= valor;
        destino.deposita(valor);
        println("Transferência bem sucedida")


    }


//    fun getSaldo():Double{
//        return this.saldo;
//    }
//
//    fun setSaldo(valor:Double){
//        if(valor > 0){
//            this.saldo = valor;
//        }
//
//    }
}