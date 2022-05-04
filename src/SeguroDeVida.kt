class SeguroDeVida(private var titular: String = "") : Tributos {

    override var tributos: Double = 0.0

    fun criaSeguro() : SeguroDeVida {
        println("Nome do titular do seguro:")
         titular = readln()
        return SeguroDeVida(titular)
    }

    override fun calculoTributos(): Double {
        tributos = 42.0
        println("Os tributos do Seguro de vida estão no valor fixo de R$$tributos")
        return 42.0
    }
}