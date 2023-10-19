package ejercicio8

// Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11

fun sumaDigitos(numero: Int): Int {
    var n = numero
    var suma = 0

    while (n > 0) {
        suma += n % 10 // Obtiene el último dígito y lo suma a la suma total
        n /= 10 // Elimina el último dígito
    }

    return suma
}

fun main () {

    val numero8=12345
    val  suma= sumaDigitos(numero8)
    println("La suma de los digitos de $numero8 es $suma")
}
