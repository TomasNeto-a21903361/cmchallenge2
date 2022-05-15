package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

class CorreioDaLusofona(
    val maxLeitores: Int,
    private val list: List<Noticia> = listOf<Noticia>()
) {
    private val leitores: MutableList<OnNoticiaListener> = mutableListOf<OnNoticiaListener>()

    fun adicionarLeitor(leitor: OnNoticiaListener) {
        //println(leitores.size)
        if (leitores.size < maxLeitores) {
            leitores.add(leitor)
            leitor.leitorAdicionadoComSucesso()
        }
        else  {
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }

    }

    fun removerLeitor(leitor: OnNoticiaListener) {
        if (leitores.contains(leitor)) {
            leitores.remove(leitor)
            leitor.leitorRemovidoComSucesso()
        }
        else {
            throw LeitorInexistenteException("Este leitor não está registado!")
        }
    }

    private fun notificarLeitores(): List<Noticia> {
        return list
    }

    fun iniciar(){
        notificarLeitores()
    }


}