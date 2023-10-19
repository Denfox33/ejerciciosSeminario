package ejercicio30


//Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un número
// triangular (puede representarse como un triángulo equilátero de puntos), o False en caso contrario.

fun triangular (numero: Int):Boolean{
    if(numero<=0){
        return false
    }
    var suma =0
    var n=1
    while(suma<numero){
        suma+=n
        n++
    }
    return suma== numero
}

fun main () {
    val num30 =4

    println("$num30 es un numero triangualr : ${triangular(num30)}")
}