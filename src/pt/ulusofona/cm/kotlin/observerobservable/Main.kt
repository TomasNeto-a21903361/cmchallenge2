package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel
import pt.ulusofona.cm.kotlin.observerobservable.models.GeradorNumerico
import pt.ulusofona.cm.kotlin.observerobservable.models.Leitor
import pt.ulusofona.cm.kotlin.observerobservable.models.LeitorPar

fun main() {
    val list = listOf<Int>()
    val geradorNumerico = GeradorNumerico(2,list)
    val xd = LeitorPar("L")
    val x = LeitorPar("L")
    geradorNumerico.adicionarLeitor(xd)
    geradorNumerico.adicionarLeitor(x)
    //print(geradorNumerico.leitores.size)
}