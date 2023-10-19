package ejercic1

// Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números
fun obtenerNumeroMaximo(listaNumeros: List<Int>): Int? {
    if (listaNumeros.isEmpty()) {
        return null
    }

    var maximo = listaNumeros[0]

    for (numero in listaNumeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }

    return maximo
}

fun main() {
    val listaDeNumeros = listOf(2, 7, 11, 27, 3)
    val maximo = obtenerNumeroMaximo(listaDeNumeros)
    if (maximo != null) {
        println("El número máximo es: $maximo")
    } else {
        println("La lista de números está vacía.")
    }
}