package ejercicio17

//Ejercicio 17 : Crea una  funcion quedada una lista de numeros,
// devuelva una nueva lista con solo paras

fun listaPares(lista: List<Int>): List<Int> {
    var mutableList : MutableList<Int> = mutableListOf()
    for (i in 0 until lista.size) {
        // recorrer el arry
        if(lista[i]%2 ==0 ){
            val valor = lista[i];

            mutableList.add(valor);

        }       
    }



    return mutableList
}

fun main() {
    val listaPar = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val paresFiltrados = listaPares(listaPar)
    println("Lista de pares: $paresFiltrados")
}
