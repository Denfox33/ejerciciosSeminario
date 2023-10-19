package ejercicio21

//Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en "aloh".

fun invertirTexto (texto: String):Boolean{

    val texto_reves =texto.reversed()
    return texto_reves == texto
}

fun main () {

    val texto1= "hola"
    val texto2="ala"
    var  textoReves = invertirTexto(texto1)
    println("Texto invertido : $texto1 es $textoReves")
    textoReves = invertirTexto(texto2)
    println("Texto invertido  :$texto2 es  $textoReves")

}

