package ejercicio33

//ejercicio 33 crea un programa se encargue de transformar un numero decimal a binario sin utilizar
// funciones propias del lenguaje

fun binario (numero: Int):String{

    var numeroDecimal = numero
    var binario=""
    while (numeroDecimal>0){
        val resto = numeroDecimal%2
        binario=resto.toString()+binario
        numeroDecimal/=2
    }
    return binario
}

fun main () {
    val numDeci= 27
    val numBinario= binario(numDeci)
    println("Numero decimal $numDeci su binario es $numBinario")
}

