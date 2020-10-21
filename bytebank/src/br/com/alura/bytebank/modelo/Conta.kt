package br.com.alura.bytebank.modelo

abstract class Conta(var titular: Cliente,
                     val numero: Int) : Autenticavel{

    var saldo = 0.0
        protected set;
    companion object{
        var total = 0
            private set
    }
    init {
        total++;
    }

    fun deposita(valor: Double) {

        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
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