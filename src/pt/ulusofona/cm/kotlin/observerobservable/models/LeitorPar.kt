package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorPar(
    nome: String,
    registado: Boolean = false
) : Leitor(nome = nome, registado = registado), OnNumeroListener {

    val numeros: MutableList<Int> = mutableListOf<Int>()

    override fun leitorAdicionadoComSucesso() {
        super<Leitor>.leitorAdicionadoComSucesso()
    }

    override fun leitorRemovidoComSucesso() {
        super<Leitor>.leitorRemovidoComSucesso()
    }

    override fun onReceiveNumero(numero: Int) {
        numeros.add(numero)
    }

    fun imprimeNumeros(): String{
        return "$nome leu os seguintes numeros pares: $numeros"
    }


}