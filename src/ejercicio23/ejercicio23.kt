package ejercicio23


    fun Armstrong(numero: Int):Boolean{

        val numeroTexto= numero.toString()
        val n = numeroTexto.length
        var sumaPotencia=0

        for (i in numeroTexto){
            val d=i.toString().toInt()
            var potencia=1
            for (j in 1..n){
                potencia*=d
            }
            sumaPotencia+=potencia
        }
        return sumaPotencia==numero
    }

fun main () {

    val numPotencia=153
    val esArmstrong = Armstrong(numPotencia)
    if(esArmstrong){
        println("$numPotencia es un numero Armstriong")
    } else {
        println("$numPotencia no es un numero Armstrong")
    }
}