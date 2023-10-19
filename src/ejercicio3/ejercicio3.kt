package ejercicio3


fun ej3 ( milla : Double ) : Double {

    val conversion =1.6
    return  milla*conversion

}

fun main () {
    val distanciaMillas=10.0;
    val distanciaKm=ej3(distanciaMillas)
    println("$distanciaMillas millas son equivalentes a $distanciaKm kilómetros.")
}