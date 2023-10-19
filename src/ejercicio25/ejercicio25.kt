package ejercicio25

//Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz bidimensional (una lista de listas).
fun menorLista (matriz : List<List<Int>>):Int {

    var minimo = matriz[0][0]
    for(i in matriz.indices) {
        for (j in matriz[0].indices) {
            val elemento = matriz[i][j]
            if (elemento < minimo) {
                minimo = elemento
            }
        }

    }
    return minimo
}

fun main() {
    val matriz = listOf(listOf(1,2,3),listOf(4,5,6),listOf(2,3,1))
    val mini = menorLista(matriz)
    println("El numero menor de la matris es $mini")
}