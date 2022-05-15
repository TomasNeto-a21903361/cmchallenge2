package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

class CorreioDaLusofona(
    val maxLeitores: Int,
    private val list: List<Noticia> = listOf<Noticia>()
) {
    private val lista: MutableList<OnNoticiaListener> = mutableListOf<OnNoticiaListener>()

    fun adicionarLeitor(leitor: OnNoticiaListener) {
        if (lista.size < maxLeitores) {
            throw LimiteDeLeitoresAtingidoException("CorreioDaLusofona atingiu o número máximo de leitores: $maxLeitores")
        }

        else if (!lista.contains(leitor)) {
            lista.add(leitor)
            leitor.leitorAdicionadoComSucesso()
        }

    }

    fun removerLeitor(leitor: OnNoticiaListener) {
        if (lista.contains(leitor)) {
            lista.remove(leitor)
            leitor.leitorRemovidoComSucesso()
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