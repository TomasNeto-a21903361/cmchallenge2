package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class GeradorNumerico(
    val maxLeitores: Int,
    private val list: List<Int> = listOf<Int>()
    ) {
    private val lista: MutableList<OnNumeroListener> = mutableListOf<OnNumeroListener>()

    fun adicionarLeitor(leitor: OnNumeroListener ) {
        if (lista.size < maxLeitores) {
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }

        else if (!lista.contains(leitor)) {
            lista.add(leitor)
            leitor.leitorAdicionadoComSucesso()
        }

        else {
            throw LeitorInexistenteException("Este leitor não está registado!")
        }

    }

    fun removerLeitor(leitor: OnNumeroListener ) {
        if (lista.contains(leitor)) {
            lista.remove(leitor)
            leitor.leitorRemovidoComSucesso()
        }
        else {
            throw LeitorInexistenteException("Este leitor não está registado!")
        }

    }

    private fun notificarLeitores(): List<Int>{
        return list
    }

    fun iniciar(){
        notificarLeitores()
    }
}