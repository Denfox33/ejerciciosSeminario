package ejercicio10

//Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.
//En matemática, la sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0
// y un 1 y continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21,
// 34, 55, 89, 144, 233, 377, 610, 987, 1597…

fun Fibo(n: Int): Int {
    if (n <= 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else {
        return Fibo(n - 1) + Fibo(n - 2)
    }
}

fun main() {

    val n=7
    val  resFibo= Fibo(n)
    println("FIbo en la psosicion $n es $resFibo")
}