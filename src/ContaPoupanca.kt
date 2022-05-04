class ContaPoupanca(private var titular: String = "", private var dinheiroGuardado: Double = 0.0) {

    fun criaContaP() : ContaPoupanca {
        println("Nome do titular da conta:")
        titular = readln()
        println("Qual o valor a guardar na poupança?")
        dinheiroGuardado = readln().toDouble()
        return ContaPoupanca(titular, dinheiroGuardado)
    }
}