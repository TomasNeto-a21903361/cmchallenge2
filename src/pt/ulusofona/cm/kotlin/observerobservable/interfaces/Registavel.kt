package pt.ulusofona.cm.kotlin.observerobservable.interfaces

interface Registavel {
    fun leitorAdicionadoComSucesso() {
        println("Leitor Adicionado Com Sucesso")
    }

    fun leitorRemovidoComSucesso() {
        println("Leitor Removido Com Sucesso")
    }
}