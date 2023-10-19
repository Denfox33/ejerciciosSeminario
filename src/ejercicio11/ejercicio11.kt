package ejercicio11

//Ejercicio 11. Crea una función que determine si dos números son primos relativos.
//Se dice que dos números son relativamente primos si su factor común más grande ( FCG ) es 1.
// Ejemplo 1: Los factores de 20 son 1, 2, 4, 5, 10 y 20. Los factores de 33 son 1, 3, 11, y 33.

fun primos( num1 : Int , num2 :Int) :Boolean {

    fun calcularFCG(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        }
        return calcularFCG(b, a % b)
    }
    val fcg = calcularFCG(num1, num2)
    return fcg == 1

}

fun main () {

    val nump1=15
    val nump2=29
    val Primos= primos(nump1,nump2)
    if(Primos){
        println("$nump1 y $nump2 son primos")
    } else {
        println("$nump1 y $nump2 no son primos")
    }
}

