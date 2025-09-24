fun verificarEdad(edad : Int){
    if (edad < 18){
        println("Eres menor de edad")
    }
    else{
        println("Eres mayor de edad")
    }
}


fun main (){
    verificarEdad(17)
    verificarEdad(32)
}