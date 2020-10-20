package br.com.alura.bytebank.modelo

class ContaCorrente(titular: Cliente, numero: Int) : ContaTransferivel(titular, numero) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1;

            if (this.saldo >= valor+valorComTaxa) {
                this.saldo -= valor+valorComTaxa;
            }

    }
}