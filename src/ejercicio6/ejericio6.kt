package ejercicio6


// Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.

fun ej6 ( texto : String , sub : String) : Int {
    var contador = 0
    var indice = texto.indexOf(sub)

    while (indice != -1) {
        contador++
        indice = texto.indexOf(sub, indice + 1)
    }

    return contador
}
fun main() {
    val texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme"
    val subcadena ="nom"
    val cantidad = ej6(texto,subcadena)
    println("La subcadena '$subcadena' aparece $cantidad veces en el texto.")
}