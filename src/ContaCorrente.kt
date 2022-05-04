class ContaCorrente(
    private var titular: String = "",
    private var saldo: Double = 0.0,

) : Tributos {

    override var tributos: Double = 0.0

    fun criaContaC() : ContaCorrente {
        println("Nome do titular da conta:")
        titular = readln()
        println("Qual o saldo da sua conta?")
        saldo = readln().toDouble()
        return ContaCorrente(titular, saldo)
    }

    override fun calculoTributos(): Double {
        tributos = saldo * 0.01
        println("Os tributos da conta Corrente de $titular são R$$tributos")
        return tributos
    }
}