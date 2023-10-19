package ejercicio24

//Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional (una lista de listas).

fun mayorLista (matriz : List<List<Int>>):Int{

    var maximo =matriz[0][0]
    for (i in matriz.indices){
        for (j in matriz[0].indices){
            val elemento= matriz[i][j]
            if(elemento>maximo){
                maximo=elemento
            }
        }
    }
    return maximo
}

fun main () {
    val matriz = listOf(listOf(1,2,3),listOf(4,5,6),listOf(2,3,1))

    val maxi = mayorLista(matriz)
    println("El numero mayor de la matris es $maxi")
}