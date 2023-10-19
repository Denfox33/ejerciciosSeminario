package ejercicio7
// Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto
fun ponerMayus ( texto : String , primera : Char) : String {

    return texto.split(" ").joinToString(" ") { it.capitalize() }
}

fun main () {
    val texto = "Hola, buenos dias"
    val letra1='e'
    val  Mayus= ponerMayus(texto,letra1)
    println(Mayus)
}