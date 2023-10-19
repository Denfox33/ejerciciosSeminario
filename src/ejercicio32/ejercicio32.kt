package ejercicio32

//Ejercicio 32: Crear un Diccionario a partir de Listas
//Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
//cree un diccionario utilizando mapOf para combinar las listas en un diccionario
//clave-valor. La función debe devolver el diccionario resultante.

fun Diccionario(claves: List<String>, valores: List<Int>): Map<String, Int> {

    return claves.zip(valores).toMap()
}

fun main() {
    val claves = listOf("a", "b", "c", "d")
    val valores = listOf(1, 2, 3, 4)

    val diccionario = Diccionario(claves, valores)
    println("Diccionario: $diccionario")
}
