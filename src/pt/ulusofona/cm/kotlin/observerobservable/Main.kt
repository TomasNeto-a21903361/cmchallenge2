package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel
import pt.ulusofona.cm.kotlin.observerobservable.models.GeradorNumerico
import pt.ulusofona.cm.kotlin.observerobservable.models.Leitor
import pt.ulusofona.cm.kotlin.observerobservable.models.LeitorImpar
import pt.ulusofona.cm.kotlin.observerobservable.models.LeitorPar

fun main() {
    val list = listOf<Int>()
    val geradorNumerico = GeradorNumerico(2,list)
    val xd = LeitorImpar("L")
    val x = LeitorPar("L")
    geradorNumerico.adicionarLeitor(xd)
    geradorNumerico.adicionarLeitor(x)
    x.onReceiveNumero(2)
    x.onReceiveNumero(3)
    x.onReceiveNumero(0)
    xd.onReceiveNumero(2)
    xd.onReceiveNumero(3)
    xd.onReceiveNumero(0)
    println(x.imprimeNumeros())
    println(xd.imprimeNumeros())
}