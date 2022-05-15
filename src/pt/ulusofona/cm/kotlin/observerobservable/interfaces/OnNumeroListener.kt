package pt.ulusofona.cm.kotlin.observerobservable.interfaces

interface OnNumeroListener: Registavel {
    override fun leitorAdicionadoComSucesso() {
        super.leitorAdicionadoComSucesso()
    }

    override fun leitorRemovidoComSucesso() {
        super.leitorRemovidoComSucesso()
    }

    fun onReceiveNumero(numero: Int) {
    }
}