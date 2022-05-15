package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class GeradorNumerico(
    val maxLeitores: Int,
    private val list: List<Int> = listOf<Int>()
    ) {
    private val lista: MutableList<OnNumeroListener> = mutableListOf<OnNumeroListener>()

    fun adicionarLeitor(leitor: OnNumeroListener ) {
        lista.add(leitor)
        leitor.leitorAdicionadoComSucesso()
    }

    fun removerLeitor(leitor: OnNumeroListener ) {
        lista.remove(leitor)
        leitor.leitorRemovidoComSucesso()
    }

    private fun notificarLeitores(){

    }

    fun iniciar(){
        notificarLeitores()
    }
}