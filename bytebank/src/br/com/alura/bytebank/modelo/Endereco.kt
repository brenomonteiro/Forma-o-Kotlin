package br.com.alura.bytebank.modelo

class Endereco(
        var logradouro: String = "",
        var numero: Int = 0,
        var bairro: String = "",
        var cidade: String = "",
        var estado: String = "",
        var cep: String = "",
        var complemento: String = ""
) {
    override fun toString(): String {
        return """
logradouro = ${logradouro}
numero = ${numero},
bairro = ${bairro}
        """.trimMargin()
    }

    fun completo(): Any {
        return """$logradouro - $numero - $bairro - $cidade - $estado - $cep - $complemento
            
        """.trimIndent()
    }
}