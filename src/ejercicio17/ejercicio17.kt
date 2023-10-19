package ejercicio17

//Ejercicio 17 : Crea una  funcion quedada una lista de numeros,
// devuelva una nueva lista con solo paras

fun listaPares(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}

fun main() {
    val listaPar = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val paresFiltrados = listaPares(listaPar)
    println("Lista de pares: $paresFiltrados")
}
