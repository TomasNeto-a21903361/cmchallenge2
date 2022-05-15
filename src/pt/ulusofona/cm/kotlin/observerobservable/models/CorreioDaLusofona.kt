package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

class CorreioDaLusofona(
    val maxLeitores: Int,
    private val list: MutableList<Noticia> = mutableListOf<Noticia>()
) {
    private val lista: MutableList<OnNoticiaListener> = mutableListOf<OnNoticiaListener>()

    fun adicionarLeitor(leitor: OnNoticiaListener) {
        lista.add(leitor)
        leitor.leitorAdicionadoComSucesso()
    }

    fun removerLeitor(leitor: OnNoticiaListener) {
        lista.remove(leitor)
        leitor.leitorRemovidoComSucesso()
    }

    private fun notificarLeitores(){

    }

    fun iniciar(){
        notificarLeitores()
    }


}