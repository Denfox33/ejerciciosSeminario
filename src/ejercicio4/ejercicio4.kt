package ejercicio4

fun ej4 (texto : String ) :Boolean{

    val textoLimpio = texto.toLowerCase().replace("\\s+".toRegex(), "")
    val textoreves = textoLimpio.reversed()
    return textoLimpio==textoreves // revisar


}
fun main () {
    val texto1="hola"
    val esPalindromo= ej4(texto1)
    println("$texto1 es palíndromo: $esPalindromo")

}