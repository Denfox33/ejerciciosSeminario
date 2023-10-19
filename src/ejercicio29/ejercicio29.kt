package ejercicio29

//Ejercicio 29: Crea una función que determine si una cadena de texto es un anagrama de otra cadena. Dos palabras
// son anagramas si tienen las mismas letras, pero en un orden diferente.
fun anagrama (cadena1: String,cadena2: String) :Boolean{

    val cadena1Limpia = cadena1.replace("\\s".toRegex(), "").toLowerCase()
    val cadena2Limpia = cadena2.replace("\\s".toRegex(), "").toLowerCase()

    // Verifica si tiene el mismo tamaño
    if (cadena1Limpia.length != cadena2Limpia.length) {
        return false
    }
    val listaCadena1 = cadena1Limpia.toList().sorted()
    val listaCadena2 = cadena2Limpia.toList().sorted()

    return listaCadena1 == listaCadena2
}

fun main() {
    val palabra1 = "listen"
    val palabra2 = "silent"

    if (anagrama(palabra1, palabra2)) {
        println("$palabra1 y $palabra2 son anagramas.")
    } else {
        println("$palabra1 y $palabra2 no son anagramas.")
    }
}