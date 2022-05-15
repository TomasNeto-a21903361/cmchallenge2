package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class GeradorNumerico(
    val maxLeitores: Int,
    private val list: List<Int> = listOf<Int>()
    ) {
    private val lista: MutableList<OnNumeroListener> = mutableListOf<OnNumeroListener>()

    fun adicionarLeitor(leitores: OnNumeroListener ) {
        if (lista.size < maxLeitores) {
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }

        else if (!lista.contains(leitores)) {
            lista.add(leitores)
            leitores.leitorAdicionadoComSucesso()
        }

    }

    fun removerLeitor(leitores: OnNumeroListener ) {
        if (lista.contains(leitores)) {
            lista.remove(leitores)
            leitores.leitorRemovidoComSucesso()
        }
        else {
            throw LeitorInexistenteException("Este leitor não está registado!")
        }
    }

    private fun notificarLeitores(){

    }

    fun iniciar(){
        notificarLeitores()
    }
}