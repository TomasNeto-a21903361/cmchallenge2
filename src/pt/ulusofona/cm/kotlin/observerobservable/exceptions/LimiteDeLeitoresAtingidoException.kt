package pt.ulusofona.cm.kotlin.observerobservable.exceptions

import pt.ulusofona.cm.kotlin.observerobservable.models.CorreioDaLusofona
import pt.ulusofona.cm.kotlin.observerobservable.models.GeradorNumerico

class LimiteDeLeitoresAtingidoException(val gerador: GeradorNumerico,override val message: String =
    "$gerador atingiu o número máximo de leitores: ${gerador.maxLeitores}") : Exception(message) {
}