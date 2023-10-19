package ejercicio2

// Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números

fun obtenerSumatoria(lista: List<Int>): Int {
    var sumatoria = 0

    for (numero in lista) {
        sumatoria += numero
    }

    return sumatoria
}

fun main() {
    val listaDeNumeros = listOf(2, 7, 11, 27, 3)
    val sumatoria = obtenerSumatoria(listaDeNumeros)
    println("La sumatoria de los números es: $sumatoria")
}
