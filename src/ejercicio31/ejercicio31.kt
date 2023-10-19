package ejercicio31
//Ejercicio 31 Duplicar el valor de los elementos en una lista
fun duplicar(numero: Int): Int {
    return numero * 2
}

fun duplicarElementos(lista: List<Int>): List<Int> {
    return lista.map(::duplicar)
}


fun main () {

    val listaNumeros = listOf(3, 7, 2, 1, 11)
    val listaDuplicada = duplicarElementos(listaNumeros)
    println("Lista duplicada: $listaDuplicada")
}