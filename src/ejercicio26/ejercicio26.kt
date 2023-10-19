package ejercicio26

//Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.
fun palabraMasLarga(listaPalabras: List<String>): String? {
    if (listaPalabras.isEmpty()) {
        return null
    }

    var palabraMasLarga = listaPalabras[0]

    for (palabra in listaPalabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra
        }
    }

    return palabraMasLarga
}

fun main() {
    val listaDePalabras = listOf("gato", "perro", "elefante", "ratón", "tigre")
    val resultado = palabraMasLarga(listaDePalabras)
    if (resultado != null) {
        println("La palabra más larga es: $resultado")
    } else {
        println("La lista de palabras está vacía.")
    }
}


