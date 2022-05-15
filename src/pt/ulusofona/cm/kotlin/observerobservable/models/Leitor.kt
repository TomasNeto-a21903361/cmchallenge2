package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel

abstract class Leitor(
    val nome: String,
    private var registado: Boolean = false
) : Registavel {

    override fun leitorAdicionadoComSucesso() {
        super.leitorAdicionadoComSucesso()
        registado = true
    }

    override fun leitorRemovidoComSucesso() {
        super.leitorRemovidoComSucesso()
        registado = false
    }

    fun estaRegistado() {
        registado
    }


}