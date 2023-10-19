package ejercicio5

fun ej5 ( texto :String , letra : Char) : Int {

    val fraseMinus = texto.toLowerCase()
    val letraMinus =letra.toLowerCase()
    var contador =0

    for (caracter in fraseMinus){

        if (caracter == letraMinus) {
            contador++;

        }

    }
    return  contador;
}

fun main () {

    val texto = "Hola, buenos dias"
    val letra= 'a'
    val cantidad=ej5(texto,letra)
    println("La letra '$letra' aparece $cantidad veces en el texto.")
}

