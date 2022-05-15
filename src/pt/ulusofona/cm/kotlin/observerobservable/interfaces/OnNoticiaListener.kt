package pt.ulusofona.cm.kotlin.observerobservable.interfaces

import pt.ulusofona.cm.kotlin.observerobservable.classes.Noticia

interface OnNoticiaListener: Registavel {
    override fun leitorAdicionadoComSucesso() {
        super.leitorAdicionadoComSucesso()
    }

    override fun leitorRemovidoComSucesso() {
        super.leitorRemovidoComSucesso()
    }

    fun onReceiveNoticia (noticia: Noticia) {
    }
}