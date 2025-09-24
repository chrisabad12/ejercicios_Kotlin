class Coche(val marca: String, val color: String, var velocidad: Int) {
    fun acelerar(aumento: Int) {
        velocidad += aumento
        println("Acelerando... Velocidad: $velocidad km/h")
    }

    fun frenar(disminucion: Int) {
        velocidad = (velocidad - disminucion).coerceAtLeast(0)
        println("Frenando... Velocidad: $velocidad km/h")
    }
}

fun main() {
    val coche = Coche("Toyota", "Rojo", 0)
    coche.acelerar(50)
    coche.frenar(20)
}
