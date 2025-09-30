
fun main(){
    var texto: String? = null

    println("Texto nulo: $texto")

    texto = "Hola"
    if (texto != null){
        println("Longitud del texto es: ${texto.length}")
    }

}