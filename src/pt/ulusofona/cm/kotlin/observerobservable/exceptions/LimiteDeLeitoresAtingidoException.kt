package pt.ulusofona.cm.kotlin.observerobservable.exceptions

import pt.ulusofona.cm.kotlin.observerobservable.classes.CorreioDaLusofona
import pt.ulusofona.cm.kotlin.observerobservable.classes.GeradorNumerico

class LimiteDeLeitoresAtingidoException(val gerador: CorreioDaLusofona,override val message: String =
    "$gerador atingiu o número máximo de leitores: ${gerador.maxLeitores}") : Exception(message) {
}