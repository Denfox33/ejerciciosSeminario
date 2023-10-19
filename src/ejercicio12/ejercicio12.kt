package ejercicio12

//Ejercicio 12. Crea una función que determine si un número dado es capicúa

fun capicuo (num : Int) :Boolean{

    val numeroTexto = num.toString()
    val longitud = numeroTexto.length
    val numeroReves = numeroTexto.reversed()
    var ok = true;
    for (i in 0 until longitud / 2) {
        if (numeroTexto[i] != numeroReves[i]) {
            ok=false
        }
    }

    // Agregamos el return true cuando no se encuentra ninguna diferencia
    return ok
}

fun main () {

    val numcapi1=121
    val numcapi2=2322
    val esCap1= capicuo(numcapi1)
    val esCap2= capicuo(numcapi2)
    println("$numcapi1 es capicuo: $esCap1")
    println("$numcapi2 es capicuo: $esCap2")
}