fun main(){
    val nombres = listOf("Ana", "Christian", "Pedro", "Mar", "Juan")
    val filtrados = nombres.filter { it.length <= 3 }
    println("Nombres cortos: $filtrados")
}