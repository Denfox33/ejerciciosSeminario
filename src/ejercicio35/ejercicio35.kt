package ejercicio35

//Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
// - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
// - "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a
//menor.
// - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
//automáticamente.

fun ordenarLista(lista: MutableList<Int>, orden: String) {
    val n = lista.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if ((orden == "Asc" && lista[j] > lista[j + 1]) || (orden == "Desc" && lista[j] < lista[j + 1])) {
                val temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp
            }
        }
    }
}

fun main() {
    val listaNumeros = mutableListOf(9, 2, 8, 4, 6)
    val orden = "Asc" // Cambia a "Desc" para orden descendente
    ordenarLista(listaNumeros, orden)
    println("Lista ordenada $orden: $listaNumeros")
}
