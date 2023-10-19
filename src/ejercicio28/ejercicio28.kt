package ejercicio28

//Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo caracteres alfabéticos (letras) y espacios en blanco.
fun contenedor(cadena: String): Boolean {
    return cadena.matches(Regex("^[A-Za-z ]+\$"))
}

fun main() {
    var cadena = "hola mundo"
    var sinVocales = contenedor(cadena)
    println("Frase sin números y caracteres especiales: $sinVocales")
}