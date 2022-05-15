package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel
import pt.ulusofona.cm.kotlin.observerobservable.models.*

fun main() {
    val list = listOf<Int>()
    val geradorNumerico = GeradorNumerico(3,list)
    val xd = LeitorImpar("L")
    val x = LeitorPar("W")
    val b = Bufo("Help")
    val n = Noticia("sd","s")
    geradorNumerico.adicionarLeitor(xd)
    geradorNumerico.adicionarLeitor(x)
    geradorNumerico.adicionarLeitor(b)
    x.onReceiveNumero(2)
    x.onReceiveNumero(3)
    x.onReceiveNumero(0)
    x.onReceiveNumero(400)
    xd.onReceiveNumero(2)
    xd.onReceiveNumero(3)
    xd.onReceiveNumero(5)
    xd.onReceiveNumero(1)
    b.onReceiveNumero(1)
    b.onReceiveNumero(2)
    b.onReceiveNumero(3)
    b.onReceiveNoticia(n)
    println(x.imprimeNumeros())
    println(xd.imprimeNumeros())
    println(b.imprimeNumeros())
    println(b.imprimeNoticias())
}