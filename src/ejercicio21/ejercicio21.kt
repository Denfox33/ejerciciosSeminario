package ejercicio21

//Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en "aloh".

fun invertirTexto (texto: String):Boolean{

    val texto_reves =texto.reversed()
    return texto_reves == texto
}

fun main () {

    val texto21= "hola"
    val  textoReves = invertirTexto(texto21)
     println("Texto invertido : $textoReves")

}

