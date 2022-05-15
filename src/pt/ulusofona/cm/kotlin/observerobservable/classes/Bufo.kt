package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class Bufo(
           nome: String,
           registado: Boolean = false
) : Leitor(nome = nome, registado = registado), OnNumeroListener, OnNoticiaListener {

    val numeros: MutableList<Int> = mutableListOf<Int>()
    val noticias: MutableList<Noticia> = mutableListOf<Noticia>()


    override fun leitorAdicionadoComSucesso() {
        super<Leitor>.leitorAdicionadoComSucesso()
    }

    override fun leitorRemovidoComSucesso() {
        super<Leitor>.leitorRemovidoComSucesso()
    }

    override fun onReceiveNumero(numero: Int) {
        super.onReceiveNumero(numero)
        numeros.add(numero)
    }

    override fun onReceiveNoticia(noticia: Noticia) {
        super.onReceiveNoticia(noticia)
        noticias.add(noticia)
    }

    fun imprimeNumeros(): String {
        return "$nome escutou os seguintes numeros: $numeros"
    }

    fun imprimeNoticias(): String {
        return "$nome leu as seguintes noticias: $noticias"
    }


}


