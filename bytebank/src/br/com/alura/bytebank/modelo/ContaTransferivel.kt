package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(titular: Cliente,
                                 numero: Int): Conta(titular = titular,numero = numero) {


    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            println("Transferência bem sucedida")
            return true;
        } else {
            println("Falha ao transferir")
            return false;
        }
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