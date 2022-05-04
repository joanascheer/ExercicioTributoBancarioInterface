interface Tributos {

    var tributos: Double

    fun calculoTributos() : Double {
        println("Tributos: $tributos")
        return tributos
    }
}