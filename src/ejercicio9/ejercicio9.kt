package ejercicio9

// Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números naturales

fun MCD (numero1 : Int , numero2 : Int) : Int {

    var a = numero1
    var b = numero2
    while (b!=0) {
        val divisor =b
        b=a%b
        a=divisor

    }
    return a
}

fun main () {

    val num1=48
    val num2=18
    val mcd= MCD(num1,num2)
    println("El MCD de $num1 y $num2 es $mcd")
}