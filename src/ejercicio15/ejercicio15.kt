package ejercicio15

//Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
// que determine si los elementos, uno a uno, de ambos arrays son iguales
fun comparar(array1: IntArray, array2: IntArray): BooleanArray {
    // Verifica que ambos arrays tengan la misma longitud
    if (array1.size != array2.size) {
        throw IllegalArgumentException("No tienen el mis mo tañano")
    }

    val resultado = BooleanArray(array1.size)

    for (i in array1.indices) {
        resultado[i] = array1[i] == array2[i]
    }

    return resultado
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 2, 3, 6, 5)

    val resultados = comparar(array1, array2)

    for (i in resultados.indices) {
        if (resultados[i]) {
            println("Elemento $i es igual en ambos arrays")
        } else {
            println("Elemento $i no es igual en ambos arrays")
        }
    }
}