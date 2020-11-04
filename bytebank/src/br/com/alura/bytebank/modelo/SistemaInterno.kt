package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado:() -> Unit={}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Sistema");
            autenticado()
        }else {
            println("Falha ao logar");
        }
    }

    fun entraReciever(admin: Autenticavel, senha: Int, autenticado:SistemaInterno.() -> Unit={}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Sistema");
            autenticado(this)
        }else {
            println("Falha ao logar");
        }
    }

    fun pagamento() {
        TODO("Not yet implemented")
        println("pagamento")
    }
}