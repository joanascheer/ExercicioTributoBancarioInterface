import kotlin.system.exitProcess

class Menu {
    init {
        println("Seja bem vindo(a) ao Cálculo de Tributos\n" +
                "Qual o seu tipo de serviço?\n" +
                "[1] - Conta Corrente\n" +
                "[2] - Conta Poupança\n" +
                "[3] - Seguro de Vida\n" +
                "[4] - Sair")
        when(readln()) {
            "1" -> {
                val contaCorrente = ContaCorrente().criaContaC()
                contaCorrente.calculoTributos()
                menuSecundario()
            }
            "2" -> {
                val contaPoupanca = ContaPoupanca().criaContaP()
                println("Sua conta não é tributada")
                menuSecundario()
            }
            "3" -> {
                val seguroDeVida = SeguroDeVida().criaSeguro()
                seguroDeVida.calculoTributos()
                menuSecundario()
            }
            "4" -> {
                exitProcess(0)
            }
        }
    }

    fun menuSecundario() {
        println("Deseja realizar novo cálculo?\n" +
                "[1] - SIM | [2] - NÃO")
        when (readln()) {
            "1" -> {
                Menu()
            }
            "2" -> {
                exitProcess(0)
            }
        }
    }
}