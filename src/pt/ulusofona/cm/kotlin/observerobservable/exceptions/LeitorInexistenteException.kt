package pt.ulusofona.cm.kotlin.observerobservable.exceptions

class LeitorInexistenteException(override val message: String = "Este leitor não está registado!") : Exception(message) {

}