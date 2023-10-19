package ejercicio19

//ejercicio 19 crea una funcion que dada una cadena de texto,
// elimine todas las voacales d ela cadena
fun eliminaVocales(texto: String):String {

    val textoSinVocales = texto.replace("[aeiouAEIOU]".toRegex(), "")
    return textoSinVocales

}
fun main () {
    val texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme"
    val textoSinvocales=eliminaVocales(texto)
    println("Texto sin vocales $textoSinvocales")
}