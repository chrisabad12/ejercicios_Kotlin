
fun main() {
    val frutas = mutableListOf("Manzana", "Banana")
    frutas.add("Pera")
    println("Después de agregar: $frutas")

    frutas.remove("Banana")
    println("Después de eliminar: $frutas")

    frutas.add("Durazno")
    frutas.sort()
    println("Ordenadas: $frutas")
}
