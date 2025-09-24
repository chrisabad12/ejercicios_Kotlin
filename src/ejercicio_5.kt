class CuentaBancaria(val titular: String, var saldo: Double) {
    fun ingresar(cantidad: Double) {
        saldo += cantidad
        println("Ingresado $cantidad. Saldo actual: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retirado $cantidad. Saldo actual: $saldo")
        } else {
            println("Fondos insuficientes")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria("Carlos", 100.0)
    cuenta.ingresar(50.0)
    cuenta.retirar(30.0)
}