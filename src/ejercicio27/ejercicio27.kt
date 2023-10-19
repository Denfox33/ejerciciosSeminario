package ejercicio27

//Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta
fun palabraMasCorta(listaPalabras: List<String>): String? {
    if (listaPalabras.isEmpty()) {
        return null
    }

    var palabraMasCorta = listaPalabras[0]

    for (palabra in listaPalabras) {
        if (palabra.length < palabraMasCorta.length) {
            palabraMasCorta = palabra
        }
    }

    return palabraMasCorta
}

fun main() {
    val listaDePalabras = listOf("gato", "perro", "elefante", "ratón", "tigre")
    val resultado = palabraMasCorta(listaDePalabras)
    if (resultado != null) {
        println("La palabra más corta es: $resultado")
    } else {
        println("La lista de palabras está vacía.")
    }
}






