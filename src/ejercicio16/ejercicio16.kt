package ejercicio16

//Ejercicio 16 crea una funcionc que calcule el productos de todos los elementos
// en una lista

fun proLista(lista: List<Int>): Int {
    if (lista.isEmpty()) {
        return 0  // comprobar si la lista esta vacia
    }

    var producto = 1

    for (elemento in lista) {
        producto *= elemento
    }

    return producto
}

fun main() {
    val listaDeNumeros = listOf(2, 3, 4, 5)
    val producto = proLista(listaDeNumeros)
    println("El producto de los elementos es: $producto")
}
