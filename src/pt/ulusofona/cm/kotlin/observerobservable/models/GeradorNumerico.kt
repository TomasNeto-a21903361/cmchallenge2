package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class GeradorNumerico(
    val maxLeitores: Int,
    private val list: List<Int> = listOf<Int>()
    ) {
    private val leitores: MutableList<OnNumeroListener> = mutableListOf<OnNumeroListener>()

    fun adicionarLeitor(leitor: OnNumeroListener ) {
        if (leitores.size < maxLeitores) {
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }

        else if (!leitores.contains(leitor)) {
            leitores.add(leitor)
            leitor.leitorAdicionadoComSucesso()
        }


    }

    fun removerLeitor(leitor: OnNumeroListener ) {
        if (leitores.contains(leitor)) {
            leitores.remove(leitor)
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