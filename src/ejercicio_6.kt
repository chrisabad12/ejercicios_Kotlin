

fun main() {
    val numeros = (1..10).toList()
    println("Tamaño: ${numeros.size}")
    println("Primero: ${numeros.first()}, Último: ${numeros.last()}")
    println("Suma total: ${numeros.sum()}")
    println("Números pares: ${numeros.filter { it % 2 == 0 }}")
}
