package pt.ulusofona.cm.kotlin.observerobservable.exceptions

import pt.ulusofona.cm.kotlin.observerobservable.models.CorreioDaLusofona

class LimiteDeLeitoresAtingidoException(val gerador: CorreioDaLusofona,override val message: String =
    "$gerador atingiu o número máximo de leitores: ${gerador.maxLeitores}") : Exception(message) {
}